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
package org.techytax.dao;

import java.sql.SQLException;
import java.util.List;

import org.techytax.domain.Activa;
import org.techytax.domain.Passiva;
import org.techytax.util.IbatisUtil;

import com.ibatis.sqlmap.client.SqlMapClient;

public class FiscaalDao {

	@SuppressWarnings("unchecked")
	public List<Activa> getActivaLijst(String boekjaar) throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		try {
			return sqlMap.queryForList("getActivaLijst", boekjaar);
		} catch (SQLException ex) {
			throw ex;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Passiva> getPassivaLijst(String boekjaar) throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		try {
			return sqlMap.queryForList("getPassivaLijst", boekjaar);
		} catch (SQLException ex) {
			throw ex;
		}
	}

}