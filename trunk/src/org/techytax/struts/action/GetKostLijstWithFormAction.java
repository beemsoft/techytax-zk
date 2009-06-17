/**
 * Copyright 2009 Hans Beemsterboer
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
package org.techytax.struts.action;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.techytax.dao.BoekDao;
import org.techytax.domain.Balans;
import org.techytax.domain.FiscalOverview;
import org.techytax.domain.Kost;
import org.techytax.domain.Liquiditeit;
import org.techytax.domain.Periode;
import org.techytax.domain.Reiskosten;
import org.techytax.helper.BalanceCalculator;
import org.techytax.helper.FiscalOverviewHelper;
import org.techytax.struts.form.BalansForm;
import org.techytax.util.DateHelper;

public class GetKostLijstWithFormAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			final HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		final ActionErrors errors = new ActionErrors();
		String forward = "failure";

		List<Kost> result = null;
		BalansForm balansForm = (BalansForm) form;
		if (balansForm.getBalansSoort() == null) {
			Periode periode = DateHelper.getPeriodeVorigJaar();
			balansForm.setBalansSoort("alles");
			balansForm.setBeginDatum(DateHelper
					.getDate(periode.getBeginDatum()));
			balansForm.setEindDatum(DateHelper.getDate(periode.getEindDatum()));
		}
		try {
			BoekDao boekDao = new BoekDao();
			result = boekDao.getKostLijst(balansForm.getBeginDatum(),
					balansForm.getEindDatum(), balansForm.getBalansSoort());
			request.setAttribute("kostLijst", result);

			if (balansForm.getBalansSoort().equals("btwBalans")) {
				Balans balans = BalanceCalculator.calculateBtwBalance(result);
				request.setAttribute("btwOut", balans.getTotaleKosten());
				request.setAttribute("btwIn", balans.getTotaleBaten());
				request.setAttribute("balans", balans.getTotaleBaten()
						.subtract(balans.getTotaleKosten()));
				request.setAttribute("brutoOmzet", balans.getBrutoOmzet());
				request.setAttribute("nettoOmzet", balans.getNettoOmzet());
			} else if (balansForm.getBalansSoort().equals("rekeningBalans")) {
				Liquiditeit liquiditeit = BalanceCalculator
						.calculatAccountBalance(result);
				request.setAttribute("balans", liquiditeit.getRekeningBalans());
				request.setAttribute("sparen", liquiditeit.getSpaarBalans());
				request.setAttribute("private", liquiditeit.getPriveBalans());
			} else if (balansForm.getBalansSoort().equals("kostenBalans")) {
				Balans balans = BalanceCalculator.calculatCostBalance(result);
				request.setAttribute("kosten", balans.getTotaleKosten());
				request.setAttribute("baten", balans.getTotaleBaten());
			} else if (balansForm.getBalansSoort().equals("reiskostenBalans")) {
				Reiskosten balans = BalanceCalculator
						.calculatTravelCostBalance(result);
				request.setAttribute("kostenOv", balans.getOvKosten());
				request.setAttribute("kostenAutoMetBtw", balans
						.getAutoKostenMetBtw());
				request.setAttribute("kostenAutoZonderBtw", balans
						.getAutoKostenZonderBtw());
				BigDecimal verschil = balans.getAutoKostenMetBtw().subtract(
						balans.getAutoKostenZonderBtw());
				request.setAttribute("verschil", verschil);
			}
			String action = (String) request.getParameter("action");
			if (action == null) {
				forward = "success";
			} else {
				if (action.equals("Fiscaal overzicht")) {
					FiscalOverview overview = FiscalOverviewHelper
							.createFiscalOverview(balansForm.getBeginDatum(),
									balansForm.getEindDatum(), result);
					request.setAttribute("overzicht", overview);
					forward = "fiscaal";
				} else {
					forward = "success";					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			ActionMessage message = null;
			if (e.getMessage().startsWith("error")) {
				message = new ActionMessage(e.getMessage());				
			} else {
				message = new ActionMessage("errors.detail", e.getMessage());
			}
			errors.add(ActionErrors.GLOBAL_MESSAGE, message);
			addErrors(request, errors);
			saveErrors(request, errors);
			return mapping.findForward("error");
		}
		return mapping.findForward(forward);
	}

}
