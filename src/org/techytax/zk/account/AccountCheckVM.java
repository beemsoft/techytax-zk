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
package org.techytax.zk.account;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.techytax.dao.AccountDao;
import org.techytax.dao.BoekDao;
import org.techytax.domain.Account;
import org.techytax.domain.AccountBalance;
import org.techytax.domain.Balans;
import org.techytax.domain.Cost;
import org.techytax.domain.Liquiditeit;
import org.techytax.domain.Periode;
import org.techytax.domain.User;
import org.techytax.helper.BalanceCalculator;
import org.techytax.util.DateHelper;
import org.techytax.zk.cost.CostVM3;
import org.techytax.zk.login.UserCredentialManager;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.util.resource.Labels;
import org.zkoss.zul.ListModelList;

public class AccountCheckVM extends CostVM3 {

	private AccountDao accountDao = new AccountDao();
	private BoekDao boekDao = new BoekDao();
	private User user = UserCredentialManager.getUser();
	private BigDecimal businessAccountBalance;
	
	protected Periode periode = DateHelper.getLatestVatPeriod();
	
	protected List<Cost> costList;
	private AccountCheckData accountCheckData = new AccountCheckData();
	
	public ListModelList<Cost> getCosts() throws Exception {
		BoekDao boekDao = new BoekDao();
		User user = UserCredentialManager.getUser();
		if (user != null) {
			costList = boekDao.getKostLijst(DateHelper.getDate(periode.getBeginDatum()), DateHelper.getDate(periode.getEindDatum()), "rekeningBalans", Long.toString(user.getId()));
			for (Cost cost : costList) {
				cost.setKostenSoortOmschrijving(Labels.getLabel(cost.getKostenSoortOmschrijving()));
			}				
			costs = new ListModelList<Cost>(costList);
			getAccountCheck();
		}
		return costs;
	}
	
	public void getAccountCheck() throws Exception {
		User user = UserCredentialManager.getUser();
		BigDecimal actualBalance = BalanceCalculator.getActualAccountBalance(DateHelper.getDate(periode.getBeginDatum()), DateHelper.getDate(periode.getEindDatum()), user.getId());
		Liquiditeit liquiditeit = BalanceCalculator.calculateAccountBalance(costList);
		List<Cost> result2 = boekDao.getKostLijst(DateHelper.getDate(periode.getBeginDatum()), DateHelper.getDate(periode.getEindDatum()), "btwBalans", Long.toString(user.getId()));
		Balans balans = BalanceCalculator.calculateBtwBalance(result2, true);
		BigDecimal totalPaidInvoices = BalanceCalculator.calculateTotalPaidInvoices(costList);
		BigDecimal brutoOmzet = balans.getBrutoOmzet().add(totalPaidInvoices);
		List<Cost> result3 = boekDao.getKostLijst(DateHelper.getDate(periode.getBeginDatum()), DateHelper.getDate(periode.getEindDatum()), "tax", Long.toString(user.getId()));
		BigDecimal taxBalance = BalanceCalculator.calculateTaxBalance(result3).getTotaleKosten();
		List<Cost> result4 = boekDao.getCostListCurrentAccount(DateHelper.getDate(periode.getBeginDatum()), DateHelper.getDate(periode.getEindDatum()), Long.toString(user.getId()));
		BigDecimal costBalance = BalanceCalculator.calculateCostBalanceCurrentAccount(result4, true).getTotaleKosten();
		BigDecimal interest = boekDao.getInterest(DateHelper.getDate(periode.getBeginDatum()), DateHelper.getDate(periode.getEindDatum()), Long.toString(user.getId()));
		BigDecimal costIgnoreBalance = boekDao.getCostsCurrentAccountIgnore(DateHelper.getDate(periode.getBeginDatum()), DateHelper.getDate(periode.getEindDatum()), Long.toString(user.getId()));
		accountCheckData.setCostIgnoreBalance(costIgnoreBalance);
		BigDecimal doubleCheck = balans.getBrutoOmzet().add(totalPaidInvoices).subtract(taxBalance).subtract(costBalance).subtract(
				liquiditeit.getSpaarBalans().subtract(liquiditeit.getPriveBalans()).subtract(interest)).add(costIgnoreBalance);
		
		accountCheckData.setAccountBalance(liquiditeit.getRekeningBalans());
		accountCheckData.setCostBalance(costBalance);
		accountCheckData.setGrossIncome(brutoOmzet);
		accountCheckData.setInterest(interest);
		accountCheckData.setPaidInvoices(totalPaidInvoices);
		accountCheckData.setPrivateWithdrawalBalance(liquiditeit.getPriveBalans());
		accountCheckData.setSavingBalance(liquiditeit.getSpaarBalans());
		accountCheckData.setTaxBalance(taxBalance);
		accountCheckData.setDoubleCheck(doubleCheck);
		accountCheckData.setActualBalance(actualBalance);
	
	}
	
	@NotifyChange({"selected"})
	public void setSelected(Cost selected) {
		this.selected = selected;
	}	
	
	@NotifyChange({"costs", "accountCheck", "accountCheckData"})	
	public void setBeginDate(Date beginDate) {
		periode.setBeginDatum(beginDate);
	}
	
	public Date getBeginDate() {
		return periode.getBeginDatum();
	}
	
	@NotifyChange({"costs", "accountCheck", "accountCheckData"})	
	public void setEndDate(Date endDate) {
		periode.setEindDatum(endDate);
	}
	
	public Date getEndDate() {
		return periode.getEindDatum();
	}

	public Periode getPeriode() {
		return periode;
	}

	public List<Cost> getCostList() {
		return costList;
	}

	// action command

	@NotifyChange({"accountCheck", "accountCheckData"})	
	@Command
	public void saveAccountBalance() throws Exception {
		if (user != null) {
			AccountBalance accountBalance = new AccountBalance();
			accountBalance.setUserId(user.getId());
			accountBalance.setBalance(businessAccountBalance);
			accountBalance.setDatum(periode.getEindDatum());
			Account businessAccount = accountDao.getBusinessAccount(user.getId());
			accountBalance.setAccountId(businessAccount.getId());
			accountDao.insertAccountBalance(accountBalance);
			getAccountCheck();
		}
	}

	// TODO: check for onbepaald
	
	public BigDecimal getBusinessAccountBalance() {
		return businessAccountBalance;
	}

	public void setBusinessAccountBalance(BigDecimal businessAccountBalance) {
		this.businessAccountBalance = businessAccountBalance;
	}

	public AccountCheckData getAccountCheckData() {
		return accountCheckData;
	}

	public void setAccountCheckData(AccountCheckData accountCheckData) {
		this.accountCheckData = accountCheckData;
	}

}
