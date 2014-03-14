/**
 * Copyright 2013 Hans Beemsterboer
 * 
 * This file is part of the TechyTax program.
 *
 * TechyTax is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * TechyTax is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TechyTax; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.techytax.helper;

import static org.techytax.domain.CostConstants.ADVERTENTIE;
import static org.techytax.domain.CostConstants.ADVERTENTIE_ZONDER_BTW;
import static org.techytax.domain.CostConstants.BUSINESS_CAR;
import static org.techytax.domain.CostConstants.BUSINESS_CAR_OTHER_ACCOUNT;
import static org.techytax.domain.CostConstants.BUSINESS_FOOD;
import static org.techytax.domain.CostConstants.BUSINESS_FOOD_OTHER_ACCOUNT;
import static org.techytax.domain.CostConstants.DEPRECIATION_CAR;
import static org.techytax.domain.CostConstants.DEPRECIATION_MACHINE;
import static org.techytax.domain.CostConstants.DEPRECIATION_SETTLEMENT;
import static org.techytax.domain.CostConstants.EXPENSE_CURRENT_ACCOUNT;
import static org.techytax.domain.CostConstants.EXPENSE_OTHER_ACCOUNT;
import static org.techytax.domain.CostConstants.FISCALE_BIJTELLING_AUTO;
import static org.techytax.domain.CostConstants.FOOD_TAXFREE_PERCENTAGE;
import static org.techytax.domain.CostConstants.FROM_PRIVATE_ACCOUNT;
import static org.techytax.domain.CostConstants.FROM_SAVINGS_ACCOUNT;
import static org.techytax.domain.CostConstants.INCOME_TAX_PAID_BACK;
import static org.techytax.domain.CostConstants.INKOMST_DEZE_REKENING;
import static org.techytax.domain.CostConstants.INLEG;
import static org.techytax.domain.CostConstants.INVOICE_PAID;
import static org.techytax.domain.CostConstants.INVOICE_SENT;
import static org.techytax.domain.CostConstants.OPNAME;
import static org.techytax.domain.CostConstants.REPURCHASES;
import static org.techytax.domain.CostConstants.SETTLEMENT;
import static org.techytax.domain.CostConstants.SETTLEMENT_DISCOUNT;
import static org.techytax.domain.CostConstants.SETTLEMENT_INTEREST;
import static org.techytax.domain.CostConstants.SETTLEMENT_OTHER_ACCOUNT;
import static org.techytax.domain.CostConstants.TO_PRIVATE_ACCOUNT;
import static org.techytax.domain.CostConstants.TO_SAVINGS_ACCOUNT;
import static org.techytax.domain.CostConstants.TRAVEL_WITH_PUBLIC_TRANSPORT;
import static org.techytax.domain.CostConstants.TRAVEL_WITH_PUBLIC_TRANSPORT_OTHER_ACCOUNT;
import static org.techytax.domain.CostConstants.UITGAVE_CREDIT_CARD;
import static org.techytax.domain.CostConstants.UITGAVE_DEZE_REKENING_FOUTIEF;
import static org.techytax.domain.CostConstants.VAT_CORRECTION_CAR_PRIVATE;
import static org.techytax.domain.CostConstants.ROAD_TAX;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.techytax.cache.CostTypeCache;
import org.techytax.dao.AccountDao;
import org.techytax.domain.Account;
import org.techytax.domain.AccountBalance;
import org.techytax.domain.Balans;
import org.techytax.domain.Cost;
import org.techytax.domain.CostType;
import org.techytax.domain.DeductableCostGroup;
import org.techytax.domain.KeyId;
import org.techytax.domain.Liquiditeit;
import org.techytax.domain.Reiskosten;
import org.techytax.util.DateHelper;

public class BalanceCalculator {

	public static Balans calculateBtwBalance(List<Cost> res, boolean isForAccountBalance) throws Exception {

		BigDecimal totalBtwOut = BigDecimal.ZERO;
		BigDecimal totalBtwIn = BigDecimal.ZERO;
		BigDecimal totalBtwCorrection = BigDecimal.ZERO;
		BigDecimal brutoOmzet = BigDecimal.ZERO;
		BigDecimal nettoOmzet = BigDecimal.ZERO;
		if (res != null) {
			for (int i = 0; i < res.size(); i++) {
				Cost obj = null;
				obj = res.get(i);
				if (obj != null) {

					long id = obj.getCostTypeId();
					if (obj.getCostType().equals(INVOICE_SENT) && isForAccountBalance) {
						// skip
					} else {
						CostType kostensoort = CostTypeCache.getCostType(id);
						if (kostensoort.isVatDeclarable()) {
							if (kostensoort.isBijschrijving() || kostensoort.equals(INVOICE_SENT)) {
								totalBtwIn = totalBtwIn.add(obj.getVat());
								brutoOmzet = brutoOmzet.add(obj.getAmount());
								nettoOmzet = nettoOmzet.add(obj.getAmount());
								brutoOmzet = brutoOmzet.add(obj.getVat());
							} else {
								if (kostensoort.equals(VAT_CORRECTION_CAR_PRIVATE)) {
									totalBtwCorrection = totalBtwCorrection.add(obj.getVat());
								} else {
									totalBtwOut = totalBtwOut.add(obj.getVat());
								}
							}
						}
					}
				}
			}
		}
		Balans balans = new Balans();
		balans.setTotaleBaten(totalBtwIn);
		balans.setTotaleKosten(totalBtwOut);
		balans.setBrutoOmzet(brutoOmzet);
		balans.setNettoOmzet(nettoOmzet);
		balans.setCorrection(totalBtwCorrection);
		return balans;
	}

	public static BigDecimal getActualAccountBalance(String beginDatum, String eindDatum, long userId) throws Exception {
		AccountDao accountDao = new AccountDao();
		Account businessAccount = accountDao.getBusinessAccount(userId);
		if (businessAccount != null) {
			KeyId key = new KeyId();
			key.setUserId(userId);
			key.setId(businessAccount.getId());
			List<AccountBalance> accountBalances = accountDao.getAccountBalances(key);
			Collections.sort(accountBalances);
			BigDecimal beginAmount = null;
			BigDecimal endAmount = null;
			for (AccountBalance accountBalance : accountBalances) {
				if (DateHelper.hasOneDayDifference(accountBalance.getDatum(), beginDatum)) {
					beginAmount = accountBalance.getBalance();
				}
				if (beginAmount != null) {
					if (DateHelper.hasOneDayDifference(accountBalance.getDatum(), eindDatum)) {
						endAmount = accountBalance.getBalance();
					}
					if (endAmount != null) {
						return endAmount.subtract(beginAmount);
					}
				}
			}
		}
		return null;
	}

	public static Liquiditeit calculateAccountBalance(List<Cost> res) throws Exception {
		BigDecimal totalKost = new BigDecimal(0);
		BigDecimal totalInleg = new BigDecimal(0);
		BigDecimal totalOpname = new BigDecimal(0);
		BigDecimal totalSparen = new BigDecimal(0);
		Liquiditeit liquiditeit = new Liquiditeit();
		if (res != null) {
			for (int i = 0; i < res.size(); i++) {
				Cost obj = null;
				obj = res.get(i);
				if (obj != null) {
					CostType costType = obj.getCostType();
					if (costType.isBalansMeetellen()) {
						if (costType.isBijschrijving()) {
							totalKost = totalKost.add(obj.getAmount());
							totalKost = totalKost.add(obj.getVat());
							if (costType.equals(FROM_PRIVATE_ACCOUNT) || costType.equals(INLEG)) {
								totalInleg = totalInleg.add(obj.getAmount());
							}
							if (costType.equals(FROM_SAVINGS_ACCOUNT)) {
								totalSparen = totalSparen.subtract(obj.getAmount());
							}
						} else {
							totalKost = totalKost.subtract(obj.getAmount());
							totalKost = totalKost.subtract(obj.getVat());
							if (costType.equals(TO_SAVINGS_ACCOUNT)) {
								totalSparen = totalSparen.add(obj.getAmount());
							} else if (costType.equals(TO_PRIVATE_ACCOUNT) || costType.equals(OPNAME)) {
								totalOpname = totalOpname.add(obj.getAmount());
							}
						}
					}
				}
			}
		}
		liquiditeit.setPriveBalans(totalInleg.subtract(totalOpname));
		liquiditeit.setRekeningBalans(totalKost);
		liquiditeit.setSpaarBalans(totalSparen);
		return liquiditeit;
	}

	public static boolean meetellenVoorAccount(long id) throws Exception {
		CostType kostensoort = CostTypeCache.getCostType(id);
		return kostensoort.isBalansMeetellen();
	}

	public static boolean optellenVoorAccount(long id) throws Exception {
		CostType kostensoort = CostTypeCache.getCostType(id);
		return kostensoort.isBalansMeetellen() && kostensoort.isBijschrijving();
	}

	public static Balans calculatCostBalance(List<Cost> res) {

		BigDecimal totalKost = new BigDecimal(0);
		BigDecimal totalBaat = new BigDecimal(0);
		if (res != null) {
			for (int i = 0; i < res.size(); i++) {
				Cost obj = null;
				obj = res.get(i);
				if (obj != null) {
					CostType costType = obj.getCostType();
					if (costType.equals(INKOMST_DEZE_REKENING)) {
						totalBaat = totalBaat.add(obj.getAmount());
						// BTW niet meenemen
						// totalBaat = totalBaat.add(obj.getBtw());
					} else if (costType.equals(EXPENSE_CURRENT_ACCOUNT) || costType.equals(UITGAVE_DEZE_REKENING_FOUTIEF) || costType.equals(TRAVEL_WITH_PUBLIC_TRANSPORT_OTHER_ACCOUNT)
							|| costType.equals(TRAVEL_WITH_PUBLIC_TRANSPORT) || costType.equals(BUSINESS_CAR) || costType.equals(BUSINESS_CAR_OTHER_ACCOUNT)
							|| costType.equals(ROAD_TAX) || costType.equals(UITGAVE_CREDIT_CARD) || costType.equals(EXPENSE_OTHER_ACCOUNT) || costType.equals(ADVERTENTIE)) {
						totalKost = totalKost.add(obj.getAmount());
						// BTW niet meenemen
						// totalKost = totalKost.add(obj.getBtw());
					} else if (costType.equals(BUSINESS_FOOD) || costType.equals(BUSINESS_FOOD_OTHER_ACCOUNT)) {
						// Do not apply tax deduction to this cost.
						totalKost = totalKost.add(obj.getAmount());
					}
				}
			}
		}
		Balans balans = new Balans();
		balans.setTotaleBaten(totalBaat);
		balans.setTotaleKosten(totalKost);
		return balans;
	}

	public static Balans calculateCostBalanceCurrentAccount(List<Cost> res, boolean isIncludingVat) {

		BigDecimal totalKost = new BigDecimal(0);
		if (res != null) {
			for (int i = 0; i < res.size(); i++) {
				Cost obj = null;
				obj = res.get(i);
				if (obj != null) {
					if (obj.isIncoming()) {
						totalKost = totalKost.subtract(obj.getAmount());
						if (isIncludingVat) {
							totalKost = totalKost.subtract(obj.getVat());
						}
					} else {
						totalKost = totalKost.add(obj.getAmount());
						if (isIncludingVat) {
							totalKost = totalKost.add(obj.getVat());	
						}
					}
				}
			}
		}
		Balans balans = new Balans();
		balans.setTotaleKosten(totalKost);
		return balans;
	}

	public static BigDecimal calculateTotalPaidInvoices(List<Cost> res) {
		BigDecimal total = new BigDecimal(0);
		if (res != null) {
			for (int i = 0; i < res.size(); i++) {
				Cost obj = null;
				obj = res.get(i);
				if (obj != null) {
					CostType costType = obj.getCostType();
					if (costType.equals(INVOICE_PAID)) {
						total = total.add(obj.getAmount()).add(obj.getVat());
					}
				}
			}
		}
		return total;
	}

	public static Reiskosten calculatTravelCostBalance(List<Cost> res) {
		Reiskosten reiskosten = new Reiskosten();
		BigDecimal totalKostOV = new BigDecimal(0);
		BigDecimal totalKostAuto = new BigDecimal(0);
		BigDecimal totalKostAutoMetBtw = new BigDecimal(0);
		BigDecimal totalVatCorrection = new BigDecimal(0);
		if (res != null) {
			for (int i = 0; i < res.size(); i++) {
				Cost obj = null;
				obj = res.get(i);
				if (obj != null) {
					CostType costType = obj.getCostType();
					if (costType.equals(TRAVEL_WITH_PUBLIC_TRANSPORT) || costType.equals(TRAVEL_WITH_PUBLIC_TRANSPORT_OTHER_ACCOUNT)) {
						totalKostOV = totalKostOV.add(obj.getAmount());
					} else if (costType.equals(BUSINESS_CAR) || costType.equals(BUSINESS_CAR_OTHER_ACCOUNT) || costType.equals(ROAD_TAX)) {
						totalKostAuto = totalKostAuto.add(obj.getAmount());
						totalKostAutoMetBtw = totalKostAutoMetBtw.add(obj.getAmount());
						totalKostAutoMetBtw = totalKostAutoMetBtw.add(obj.getVat());
					} else if (costType.equals(VAT_CORRECTION_CAR_PRIVATE)) {
						totalVatCorrection = totalVatCorrection.add(obj.getVat());
					}
				}
			}
		}
		reiskosten.setOvKosten(totalKostOV);
		reiskosten.setAutoKostenZonderBtw(totalKostAuto);
		reiskosten.setAutoKostenMetBtw(totalKostAutoMetBtw);
		reiskosten.setVatCorrection(totalVatCorrection);
		return reiskosten;
	}

	public static Balans calculateTaxBalance(List<Cost> res) throws Exception {
		BigDecimal total = new BigDecimal(0);
		if (res != null) {
			for (int i = 0; i < res.size(); i++) {
				Cost obj = null;
				obj = res.get(i);
				if (obj != null) {
					if (obj.getCostType().equals(INCOME_TAX_PAID_BACK)) {
						total = total.subtract(obj.getAmount());
					} else {
						total = total.add(obj.getAmount());
					}
				}
			}
		}
		Balans balans = new Balans();
		balans.setTotaleKosten(total);
		return balans;
	}

	public static BigDecimal getAfschrijvingAuto(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoort().equals(DEPRECIATION_CAR)) {
				return aftrekpost.getAftrekbaarBedrag();
			}
		}
		return null;
	}

	public static BigInteger getRepurchase(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal repurchases = BigDecimal.ZERO;
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoort().equals(REPURCHASES)) {
				repurchases = repurchases.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return repurchases.toBigInteger();
	}

	public static BigDecimal getOverigeAfschrijvingen(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoort().equals(DEPRECIATION_MACHINE)) {
				return aftrekpost.getAftrekbaarBedrag();
			}
		}
		return BigDecimal.ZERO;
	}

	public static BigDecimal getDepreciationSettlement(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoort().equals(DEPRECIATION_SETTLEMENT)) {
				return aftrekpost.getAftrekbaarBedrag();
			}
		}
		return BigDecimal.ZERO;
	}

	public static BigDecimal getFiscaleBijtelling(List<DeductableCostGroup> aftrekpostenLijst) throws Exception {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoort().equals(FISCALE_BIJTELLING_AUTO)) {
				return aftrekpost.getAftrekbaarBedrag();
			}
		}
		return BigDecimal.ZERO;
	}

	public static BigDecimal getKostenVoorAuto(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal kosten = BigDecimal.ZERO;
		List<CostType> costTypes = Arrays.asList(BUSINESS_CAR, BUSINESS_CAR_OTHER_ACCOUNT, ROAD_TAX);
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (costTypes.contains(aftrekpost.getKostenSoort())) {
				kosten = kosten.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return kosten;
	}

	public static BigDecimal getReiskosten(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal reiskosten = BigDecimal.ZERO;
		List<CostType> costTypes = Arrays.asList(TRAVEL_WITH_PUBLIC_TRANSPORT, TRAVEL_WITH_PUBLIC_TRANSPORT_OTHER_ACCOUNT);
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (costTypes.contains(aftrekpost.getKostenSoort())) {
				reiskosten = reiskosten.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return reiskosten;
	}

	public static BigDecimal getAlgemeneKosten(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal kosten = BigDecimal.ZERO;
		List<CostType> costTypes = Arrays.asList(EXPENSE_CURRENT_ACCOUNT, EXPENSE_OTHER_ACCOUNT, UITGAVE_CREDIT_CARD, ADVERTENTIE, ADVERTENTIE_ZONDER_BTW);
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = (DeductableCostGroup) iterator.next();
			if (costTypes.contains(aftrekpost.getKostenSoort())) {
				kosten = kosten.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return kosten;
	}

	public static BigDecimal getFoodCosts(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal kosten = BigDecimal.ZERO;
		List<CostType> costTypes = Arrays.asList(BUSINESS_FOOD, BUSINESS_FOOD_OTHER_ACCOUNT);
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = (DeductableCostGroup) iterator.next();
			if (costTypes.contains(aftrekpost.getKostenSoort())) {
				kosten = kosten.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return kosten.multiply(BigDecimal.valueOf(FOOD_TAXFREE_PERCENTAGE));
	}

	public static BigDecimal getSettlementCosts(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal kosten = BigDecimal.ZERO;
		List<CostType> costTypes = Arrays.asList(SETTLEMENT, SETTLEMENT_INTEREST, SETTLEMENT_OTHER_ACCOUNT);
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = (DeductableCostGroup) iterator.next();
			if (costTypes.contains(aftrekpost.getKostenSoort())) {
				kosten = kosten.add(aftrekpost.getAftrekbaarBedrag());
			} else if (aftrekpost.getKostenSoort().equals(SETTLEMENT_DISCOUNT)) {
				kosten = kosten.subtract(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return kosten;
	}

	public static BigDecimal calculatMonthlyPrivateExpenses(List<Cost> res) throws Exception {
		BigDecimal monthlyExpenses = new BigDecimal(0);
		int nofMonths = 0;
		int lastMonth = -1;
		if (res != null) {
			for (int i = 0; i < res.size(); i++) {
				Cost obj = null;
				obj = res.get(i);
				if (obj != null) {
					if (!obj.isIncoming()) {
						if (!obj.getDescription().contains("spaarrekening") && !obj.getDescription().contains("inleg")) {
							Date datum = obj.getDate();
							int month = DateHelper.getMonth(datum);
							if (month != lastMonth) {
								lastMonth = month;
								nofMonths++;
							}
							monthlyExpenses = monthlyExpenses.add(obj.getAmount());
						}
					}
				}
			}
		}
		if (nofMonths == 0) {
			return monthlyExpenses;
		} else {
			return monthlyExpenses.divide(new BigDecimal(nofMonths), RoundingMode.HALF_UP);
		}
	}

}
