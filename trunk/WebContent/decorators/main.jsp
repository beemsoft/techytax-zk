<!--
Copyright 2012 Hans Beemsterboer

This file is part of the TechyTax program.

TechyTax is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

TechyTax is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with TechyTax; if not, write to the Free Software
Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="sitemesh-decorator" prefix="decorator"%>
<%@ taglib uri="sitemesh-page" prefix="page"%>
<%@ taglib uri="struts-html" prefix="html"%>
<%@ taglib uri="struts-bean" prefix="bean"%>
<%@ taglib uri="struts-logic" prefix="logic"%>


<html:html>
<head>

<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 



<SCRIPT LANGUAGE="JavaScript" SRC="script/CalendarPopup.js"></SCRIPT>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script language="JavaScript">

function scrollToItem(id) {
	if (id != null) {
		location.href="#"+id;
	}
}

$(function() {

	$( "#language" ).change(function() {
		  $("#languageForm").submit();
	});		

});

</script>
<style type="text/css" media="screen, print">
<!--
@import url(css/default.css);
-->
</style>
<title><decorator:title default="TechyTax"/></title>
</head>
<%
	java.util.Locale locale = (java.util.Locale)request.getSession().getAttribute("org.apache.struts.action.LOCALE");
	String localeString = null;
	if (locale == null) {
		localeString = request.getLocale().toString();
	} else {
		localeString = locale.toString();
	}
%>
<body
	onload="scrollToItem(<%=request.getSession().getAttribute("id")%>)">
<table cellspacing="0" border="0" cellpadding="20" id="contentTable">
	<tr>
		<td class="noPrint" id="navigationCell" valign="top">
		<page:applyDecorator page="/WEB-INF/jsp/menu.jsp" name="panel" /></td>
		<td id="contentCell" valign="top">
		<table class="headerTable">
			<tr>
				<td><img src="images/techytax_logo.png" /></td>
				<td><logic:present name="user" scope="session">
					<logic:equal name="user" property="guest" value="true">
						<bean:message key="program.disclaimer" />
					</logic:equal>
				</logic:present>
				</td>
				<td>
				<html:form styleId="languageForm" action="/setLanguage.do">
				<bean:message key="program.language" />:
				<html:select styleId="language" property="locale" value="<%=localeString%>">
					<html:option value="nl">Nederlands</html:option>
					<html:option value="pt_BR">Português brasileiro</html:option>
					<html:option value="fr">Français</html:option>
					<html:option value="en">English</html:option>
					<html:option value="en_US">American English</html:option>
					<html:option value="el">ελληνικά</html:option>
					<html:option value="es">Español</html:option>
				</html:select>
				</html:form>
				</td>
			</tr>
		</table>
		<decorator:body /></td>
		</tr>
</table>
</body>
</html:html>
