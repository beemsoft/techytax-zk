/**
 * Copyright 2014 Hans Beemsterboer
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

import static org.techytax.util.DateHelper.getLatestVatPeriod;
import static org.techytax.util.DateHelper.getPeriodPreviousYear;
import static org.techytax.util.DateHelper.isTimeForUsingLatestYearPeriod;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.techytax.cache.CostCache;
import org.techytax.dao.AccountDao;
import org.techytax.dao.CostDao;
import org.techytax.domain.Account;
import org.techytax.domain.AccountBalance;
import org.techytax.domain.Balance;
import org.techytax.domain.Cost;
import org.techytax.domain.FiscalPeriod;
import org.techytax.domain.Liquiditeit;
import org.techytax.domain.User;
import org.techytax.domain.VatPeriodType;
import org.techytax.helper.BalanceCalculator;
import org.techytax.jpa.dao.GenericDao;
import org.techytax.util.DateHelper;
import org.techytax.zk.cost.CostVM;
import org.techytax.zk.login.UserCredentialManager;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Window;

public class AccountCheckVM extends CostVM {

	private AccountDao accountDao = new AccountDao(Account.class);
	private CostDao costDao = new CostDao(Cost.class);
	private User user = UserCredentialManager.getUser();
	private BigDecimal businessAccountBalance;

	protected FiscalPeriod periode;
	private CostCache costCache = new CostCache();

	protected List<Cost> costList;
	private AccountCheckData accountCheckData = new AccountCheckData();
	private GenericDao<AccountBalance> genericAccountBalanceDao = new GenericDao<>(AccountBalance.class);

	public AccountCheckVM() {
		if (user != null) {
			if (isTimeForUsingLatestYearPeriod()) {
				periode = getPeriodPreviousYear();
			} else {
				periode = getLatestVatPeriod(user.getVatPeriodType());
			}
		} else {
			periode = DateHelper.getLatestVatPeriod(VatPeriodType.PER_QUARTER);
			Executions.sendRedirect("login.zul");
		}
	}

	public ListModelList<Cost> getCosts() throws Exception {
		User user = UserCredentialManager.getUser();
		if (user != null) {
			costCache.setBeginDatum(periode.getBeginDate());
			costCache.setEindDatum(periode.getEndDate());
			costCache.getCosts();
			costList = costCache.getBusinessAccountCosts();
			costs = new ListModelList<>(costList);
			getAccountCheck();
		} else {
			Executions.sendRedirect("login.zul");
		}
		return costs;
	}

	public void getAccountCheck() throws Exception {
		User user = UserCredentialManager.getUser();
		if (user != null) {
			BigDecimal actualBalance = BalanceCalculator.getActualAccountBalance(DateHelper.getDate(periode.getBeginDate()), DateHelper.getDate(periode.getEndDate()));
			Liquiditeit liquiditeit = BalanceCalculator.calculateAccountBalance(costList);
			List<Cost> result2 = costDao.getVatCostsInPeriod(periode);
			Balance balans = BalanceCalculator.calculateVatBalance(result2, true);
			BigDecimal totalPaidInvoices = BalanceCalculator.calculateTotalPaidInvoices(costList);
			BigDecimal brutoOmzet = balans.getBrutoOmzet().add(totalPaidInvoices);
			List<Cost> taxCosts = costCache.getTaxCosts();
			BigDecimal taxBalance = BalanceCalculator.calculateTaxBalance(taxCosts).getTotaleKosten();
			List<Cost> costsOnCurrentAccount = costCache.getCostListCurrentAccount();
			BigDecimal costBalance = BalanceCalculator.calculateCostBalanceCurrentAccount(costsOnCurrentAccount, true).getTotaleKosten();
			BigDecimal interest = costCache.getInterest();
			BigDecimal costIgnoreBalance = costCache.getCostCurrentAccountIgnore();
			accountCheckData.setCostIgnoreBalance(costIgnoreBalance);
			BigDecimal doubleCheck = balans.getBrutoOmzet().add(totalPaidInvoices).subtract(taxBalance).subtract(costBalance)
					.subtract(liquiditeit.getSpaarBalans().subtract(liquiditeit.getPriveBalans()).subtract(interest)).add(costIgnoreBalance);

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
		} else {
			Executions.sendRedirect("login.zul");
		}
	}

	@NotifyChange({ "selected" })
	public void setSelected(Cost selected) {
		this.selected = selected;
	}

	@Command
	public void onDoubleClicked() {
		Map<String, Object> arguments = new HashMap<>();
		arguments.put("cost", selected);
		String template = "edit-cost.zul";
		Window window = (Window) Executions.createComponents(template, null, arguments);
		window.doModal();
	}

	@NotifyChange({ "costs", "accountCheck", "accountCheckData" })
	public void setBeginDate(Date beginDate) {
		periode.setBeginDate(beginDate);
	}

	public Date getBeginDate() {
		return periode.getBeginDate();
	}

	@NotifyChange({ "costs", "accountCheck", "accountCheckData" })
	public void setEndDate(Date endDate) {
		periode.setEndDate(endDate);
	}

	public Date getEndDate() {
		return periode.getEndDate();
	}

	public FiscalPeriod getPeriode() {
		return periode;
	}

	public List<Cost> getCostList() {
		return costList;
	}

	// action command

	@NotifyChange({ "accountCheck", "accountCheckData" })
	@Command
	public void saveAccountBalance() throws Exception {
		if (user != null) {
			AccountBalance accountBalance = new AccountBalance();
			accountBalance.setBalance(businessAccountBalance);
			accountBalance.setDatum(periode.getEndDate());
			Account businessAccount = accountDao.getBusinessAccount();
			accountBalance.setAccount(businessAccount);
			genericAccountBalanceDao.persistEntity(accountBalance);
			getCosts();
		}
	}

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
