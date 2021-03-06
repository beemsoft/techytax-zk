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
package org.techytax.zk.cost;

import static org.techytax.log.AuditType.DELETE_ALL_COSTS;
import static org.techytax.log.AuditType.DELETE_COST;
import static org.techytax.log.AuditType.ENTER_COST;
import static org.techytax.log.AuditType.UPDATE_COST;

import java.util.Date;
import java.util.List;

import org.techytax.cache.CostCache;
import org.techytax.cache.CostTypeCache;
import org.techytax.dao.CostTypeDao;
import org.techytax.domain.Cost;
import org.techytax.domain.CostType;
import org.techytax.domain.FiscalPeriod;
import org.techytax.domain.User;
import org.techytax.helper.AmountHelper;
import org.techytax.jpa.dao.CostDao;
import org.techytax.log.AuditLogger;
import org.techytax.util.DateHelper;
import org.techytax.zk.login.UserCredentialManager;
import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.validator.AbstractValidator;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.ListModelList;

public class CostVM {

	protected ListModelList<Cost> costs;

	protected ListModelList<CostType> costTypes;

	protected Cost selected;

	protected CostType selectedCostType;

	protected CostDao costDao;
	
	protected CostTypeDao costTypeDao;

	protected CostCache costCache;
	
	protected AuditLogger auditLogger;
	
	protected CostTypeCache costTypeCache;
	
	String deleteMessage;
	
	String deleteAllMessage;
	
	@Init
	public void init() {
		costDao = (CostDao) SpringUtil.getBean("costDao");
		auditLogger = (AuditLogger) SpringUtil.getBean("auditLogger");
		costCache = (CostCache) SpringUtil.getBean("costCache");
		costTypeDao = (CostTypeDao) SpringUtil.getBean("costTypeDao");
		costTypeCache = (CostTypeCache) SpringUtil.getBean("costTypeCache");
	}
	
	
	public String getDeleteMessage(){
		return deleteMessage;
	}
	
	public String getDeleteAllMessage(){
		return deleteAllMessage;
	}	
	
	public List<Cost> getSelectedCosts() {
		return costs;
	}
	
	@NotifyChange({"selected","costs","deleteMessage"})
	@Command
	public void deleteCost() throws Exception {
		User user = UserCredentialManager.getUser();
		if (user != null) {
			costDao = (CostDao) SpringUtil.getBean("costDao");
			auditLogger = (AuditLogger) SpringUtil.getBean("auditLogger");
			costCache = (CostCache) SpringUtil.getBean("costCache");
			
			auditLogger.log(DELETE_COST, user);
			selected.setUser(user);
			costDao.deleteEntity(selected);
			getCosts().remove(selected);
			selected = null;
			costCache.invalidate();
		}
		deleteMessage = null;		
	}	
	
	@NotifyChange({"costs","deleteAllMessage"})
	@Command
	public void deleteAllCosts() throws Exception{
		User user = UserCredentialManager.getUser();
		if (user != null) {
			auditLogger.log(DELETE_ALL_COSTS, user);
			for (Cost cost : getSelectedCosts()) {
				costDao.deleteEntity(cost);				
			}
			getCosts().removeAll(getCosts());
			selected = null;
			costCache.invalidate();
		}
		deleteAllMessage = null;
	}	
	
	@NotifyChange("deleteMessage")
	@Command
	public void confirmDelete(){
		deleteMessage = "Weet u zeker dat u wilt verwijderen: "+selected.getDescription()+" ?";
	}
	
	@NotifyChange("deleteAllMessage")
	@Command
	public void confirmDeleteAll() throws Exception{
		deleteAllMessage = "Weet u zeker dat u alle geselecteerde kosten wilt verwijderen? (Totaal: " + getSelectedCosts().size() + ")";
	}	
	
	@NotifyChange("deleteMessage")
	@Command
	public void cancelDelete(){
		deleteMessage = null;
	}
	
	@NotifyChange("deleteAllMessage")
	@Command
	public void cancelDeleteAll(){
		deleteAllMessage = null;
	}	

	public ListModelList<Cost> getCosts() throws Exception {
		User user = UserCredentialManager.getUser();
		if (user == null) {
			Executions.sendRedirect("login.zul");
		} else if (costs == null) {
			FiscalPeriod vatPeriod = DateHelper.getLatestVatPeriod(user.getVatPeriodType());
			List<Cost> vatCosts = costDao.getCostsWithPrivateMoneyExceptForTravelCosts(vatPeriod);
			costs = new ListModelList<>(vatCosts);
		}
		return costs;
	}

	public ListModelList<CostType> getCostTypes() throws Exception {
		if (costTypes == null) {
			List<CostType> vatCostTypes = costTypeDao.getCostTypesForVatCostsWithPrivateMoney();
			costTypes = new ListModelList<>(vatCostTypes);
			selectedCostType = costTypes.get(0);
		}
		return costTypes;
	}

	public Cost getSelected() {
		return selected;
	}

	@NotifyChange({ "selected", "costs" })
	@Command
	public void newCost() throws Exception {
		auditLogger.log(ENTER_COST, UserCredentialManager.getUser());
		Cost cost = new Cost();
		cost.setDate(new Date());
		getCosts().add(cost);
		selected = cost;
	}

	@NotifyChange({ "selected", "costs" })
	@Command
	public void saveCost() throws Exception {
		User user = UserCredentialManager.getUser();
		if (user != null) {
			selected.setUser(user);
			selected.setCostType(selectedCostType);
			Cost cost = (Cost) costDao.getEntity(selected, Long.valueOf(selected.getId()));
			selected.roundValues();
			if (cost == null) {
				auditLogger.log(ENTER_COST, user);
				costDao.persistEntity(selected);
			} else {
				auditLogger.log(UPDATE_COST, user);
				costDao.merge(selected);
			}
			costCache.invalidate();
		}
	}

	@NotifyChange({ "selected" })
	public void setSelected(Cost selected) {
		this.selected = selected;
	}

	public CostType getSelectedCostType() {
		return selectedCostType;
	}

	public void setSelectedCostType(CostType selected) {
		this.selectedCostType = selected;
	}
	
	@NotifyChange("selected")
	@Command
	public void highVat() throws Exception {
		AmountHelper.applyHighVat(selected);
	}

	@NotifyChange("selected")
	@Command
	public void lowVat() throws Exception {
		AmountHelper.applyLowVat(selected);
	}

	public Validator getPriceValidator() {
		return new AbstractValidator() {
			public void validate(ValidationContext ctx) {
				Double price = (Double) ctx.getProperty().getValue();
				if (price == null || price < 0) {
					addInvalidMessage(ctx, "must be equal to or larger than 0");
				}
			}
		};
	}

}
