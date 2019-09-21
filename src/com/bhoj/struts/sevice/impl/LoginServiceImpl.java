package com.bhoj.struts.sevice.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bhoj.struts.sevice.LoginService;
import com.bhoj.struts.sevice.dao.DataBaseConnection;

/**
 * @author Bhoj Sao
 *
 */
public class LoginServiceImpl implements LoginService {

	public boolean validateEmpolyee(String userName, String password) {
		String dbUserName = null;
		String dbPassword = null;
		Connection dbConnection = null;
		try {
			dbConnection = DataBaseConnection.getDBConnection();
			Statement cStmt = dbConnection.createStatement();

			ResultSet rs = cStmt.executeQuery("select USER_NAME,PASSWORD from EMPLOYEE ");
			if (rs != null) {
				while (rs.next()) {
					dbUserName = rs.getString("USER_NAME");
					dbPassword = rs.getString("PASSWORD");
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				dbConnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (userName.equalsIgnoreCase(dbUserName) && password.equalsIgnoreCase(dbPassword)) {
			return true;
		}
		return false;
	}

}
