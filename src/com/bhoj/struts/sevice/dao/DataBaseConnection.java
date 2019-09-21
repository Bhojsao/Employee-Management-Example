package com.bhoj.struts.sevice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Bhoj Sao
 *
 */
public class DataBaseConnection {

	/**
	 * Method to get Data Base connection
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 */
	public static Connection getDBConnection() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "STRUTS_DB";
		String password = "Db12345";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}
}
