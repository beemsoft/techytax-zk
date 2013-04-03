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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.techytax.dao.AccountDao;
import org.techytax.dao.KostensoortDao;
import org.techytax.domain.Account;
import org.techytax.domain.AccountBalance;
import org.techytax.domain.DeductableCostGroup;
import org.techytax.domain.Balans;
import org.techytax.domain.KeyId;
import org.techytax.domain.Cost;
import org.techytax.domain.CostConstants;
import org.techytax.domain.Kostensoort;
import org.techytax.domain.Liquiditeit;
import org.techytax.domain.Reiskosten;
import org.techytax.util.DateHelper;

public class BalanceCalculator {

	private static KostensoortDao dao = new KostensoortDao();

	public static Balans calculateBtwBalance(List<Cost> res, boolean isForAccountBalance) throws Exception {

		BigDecimal totalBtwOut = new BigDecimal(0);
		BigDecimal totalBtwIn = new BigDecimal(0);
		BigDecimal totalBtwCorrection = new BigDecimal(0);
		BigDecimal brutoOmzet = new BigDecimal(0);
		BigDecimal nettoOmzet = new BigDecimal(0);
		if (res != null) {
			for (int i = 0; i < res.size(); i++) {
				Cost obj = null;
				obj = res.get(i);
				if (obj != null) {

					long id = obj.getCostTypeId();
					if (obj.getCostTypeId() == CostConstants.INVOICE_SENT && isForAccountBalance) {
						// skip
					} else {
						Kostensoort kostensoort = dao.getKostensoort(Long.toString(id));
						if (kostensoort.isBtwVerrekenbaar()) {
							if (kostensoort.isBijschrijving() || kostensoort.getKostenSoortId() == CostConstants.INVOICE_SENT) {
								totalBtwIn = totalBtwIn.add(obj.getVat());
								brutoOmzet = brutoOmzet.add(obj.getAmount());
								nettoOmzet = nettoOmzet.add(obj.getAmount());
								brutoOmzet = brutoOmzet.add(obj.getVat());
							} else {
								if (kostensoort.getKostenSoortId() == CostConstants.VAT_CORRECTION_CAR_PRIVATE) {
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
					long id = obj.getCostTypeId();
					Kostensoort kostensoort = dao.getKostensoort(Long.toString(id));
					if (kostensoort.isBalansMeetellen()) {
						if (kostensoort.isBijschrijving()) {
							totalKost = totalKost.add(obj.getAmount());
							totalKost = totalKost.add(obj.getVat());
							if (id == CostConstants.FROM_PRIVATE_ACCOUNT || id == CostConstants.INLEG) {
								totalInleg = totalInleg.add(obj.getAmount());
							}
							if (id == CostConstants.FROM_SAVINGS_ACCOUNT) {
								totalSparen = totalSparen.subtract(obj.getAmount());
							}
						} else {
							totalKost = totalKost.subtract(obj.getAmount());
							totalKost = totalKost.subtract(obj.getVat());
							if (id == CostConstants.TO_SAVINGS_ACCOUNT) {
								totalSparen = totalSparen.add(obj.getAmount());
							} else if (id == CostConstants.TO_PRIVATE_ACCOUNT || id == CostConstants.OPNAME) {
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
		Kostensoort kostensoort = dao.getKostensoort(Long.toString(id));
		return kostensoort.isBalansMeetellen();
	}

	public static boolean optellenVoorAccount(long id) throws Exception {
		Kostensoort kostensoort = dao.getKostensoort(Long.toString(id));
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
					long id = obj.getCostTypeId();
					if (id == CostConstants.INKOMST_DEZE_REKENING) {
						totalBaat = totalBaat.add(obj.getAmount());
						// BTW niet meenemen
						// totalBaat = totalBaat.add(obj.getBtw());
					} else if (id == CostConstants.UITGAVE_DEZE_REKENING || id == CostConstants.UITGAVE_DEZE_REKENING_FOUTIEF || id == CostConstants.REISKOST_ANDERE_REKENING_FOUTIEF
							|| id == CostConstants.REISKOST || id == CostConstants.AUTO_VAN_DE_ZAAK || id == CostConstants.AUTO_VAN_DE_ZAAK_ANDERE_REKENING || id == CostConstants.WEGEN_BELASTING
							|| id == CostConstants.UITGAVE_CREDIT_CARD || id == CostConstants.UITGAVE_ANDERE_REKENING || id == CostConstants.ADVERTENTIE) {
						totalKost = totalKost.add(obj.getAmount());
						// BTW niet meenemen
						// totalKost = totalKost.add(obj.getBtw());
					} else if (id == CostConstants.BUSINESS_FOOD || id == CostConstants.BUSINESS_FOOD_OTHER_ACCOUNT) {
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
					long id = obj.getCostTypeId();
					if (id == CostConstants.INVOICE_PAID) {
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
					long id = obj.getCostTypeId();
					if (id == CostConstants.REISKOST || id == CostConstants.REISKOST_ANDERE_REKENING_FOUTIEF) {
						totalKostOV = totalKostOV.add(obj.getAmount());
					} else if (id == CostConstants.AUTO_VAN_DE_ZAAK || id == CostConstants.AUTO_VAN_DE_ZAAK_ANDERE_REKENING || id == CostConstants.WEGEN_BELASTING) {
						totalKostAuto = totalKostAuto.add(obj.getAmount());
						totalKostAutoMetBtw = totalKostAutoMetBtw.add(obj.getAmount());
						totalKostAutoMetBtw = totalKostAutoMetBtw.add(obj.getVat());
					} else if (id == CostConstants.VAT_CORRECTION_CAR_PRIVATE) {
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
					if (obj.getCostTypeId() == CostConstants.INKOMSTEN_BELASTING_TERUGGAVE) {
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
			if (aftrekpost.getKostenSoortId() == CostConstants.AFSCHRIJVING_AUTO) {
				return aftrekpost.getAftrekbaarBedrag();
			}
		}
		return null;
	}
	
	public static BigInteger getRepurchase(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal repurchases = new BigDecimal("0");
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoortId() == CostConstants.REPURCHASES) {
				repurchases = repurchases.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return repurchases.toBigInteger();
	}	

	public static BigDecimal getOverigeAfschrijvingen(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoortId() == CostConstants.DEPRECIATION_MACHINE) {
				return aftrekpost.getAftrekbaarBedrag();
			}
		}
		return null;
	}
	
	public static BigDecimal getDepreciationSettlement(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoortId() == CostConstants.DEPRECIATION_SETTLEMENT) {
				return aftrekpost.getAftrekbaarBedrag();
			}
		}
		return null;
	}	

	public static BigDecimal getFiscaleBijtelling(List<DeductableCostGroup> aftrekpostenLijst) throws Exception {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoortId() == CostConstants.FISCALE_BIJTELLING_AUTO) {
				return aftrekpost.getAftrekbaarBedrag();
			}
		}
		throw new Exception("errors.fiscal.car");
	}

	public static BigDecimal getKostenVoorAuto(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal kosten = new BigDecimal("0");
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoortId() == CostConstants.AUTO_VAN_DE_ZAAK || aftrekpost.getKostenSoortId() == CostConstants.AUTO_VAN_DE_ZAAK_ANDERE_REKENING
					|| aftrekpost.getKostenSoortId() == CostConstants.WEGEN_BELASTING) {
				kosten = kosten.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return kosten;
	}

	public static BigDecimal getReiskosten(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal reiskosten = new BigDecimal("0");
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = iterator.next();
			if (aftrekpost.getKostenSoortId() == CostConstants.REISKOST) {
				reiskosten = reiskosten.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return reiskosten;
	}

	public static BigDecimal getAlgemeneKosten(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal kosten = new BigDecimal("0");
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = (DeductableCostGroup) iterator.next();
			if (aftrekpost.getKostenSoortId() == CostConstants.UITGAVE_DEZE_REKENING || aftrekpost.getKostenSoortId() == CostConstants.UITGAVE_ANDERE_REKENING
					|| aftrekpost.getKostenSoortId() == CostConstants.UITGAVE_CREDIT_CARD || aftrekpost.getKostenSoortId() == CostConstants.ADVERTENTIE
					|| aftrekpost.getKostenSoortId() == CostConstants.ADVERTENTIE_ZONDER_BTW) {
				kosten = kosten.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return kosten;
	}

	public static BigDecimal getFoodCosts(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal kosten = new BigDecimal("0");
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = (DeductableCostGroup) iterator.next();
			if (aftrekpost.getKostenSoortId() == CostConstants.BUSINESS_FOOD || aftrekpost.getKostenSoortId() == CostConstants.BUSINESS_FOOD_OTHER_ACCOUNT) {
				kosten = kosten.add(aftrekpost.getAftrekbaarBedrag());
			}
		}
		return kosten.multiply(new BigDecimal(CostConstants.FOOD_TAXFREE_PERCENTAGE));
	}
	
	public static BigDecimal getSettlementCosts(List<DeductableCostGroup> aftrekpostenLijst) {
		Iterator<DeductableCostGroup> iterator = aftrekpostenLijst.iterator();
		BigDecimal kosten = new BigDecimal("0");
		while (iterator.hasNext()) {
			DeductableCostGroup aftrekpost = (DeductableCostGroup) iterator.next();
			if (aftrekpost.getKostenSoortId() == CostConstants.SETTLEMENT || aftrekpost.getKostenSoortId() == CostConstants.SETTLEMENT_INTEREST || aftrekpost.getKostenSoortId() == CostConstants.SETTLEMENT_OTHER_ACCOUNT) {
				kosten = kosten.add(aftrekpost.getAftrekbaarBedrag());
			} else if (aftrekpost.getKostenSoortId() == CostConstants.SETTLEMENT_DISCOUNT) {
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
