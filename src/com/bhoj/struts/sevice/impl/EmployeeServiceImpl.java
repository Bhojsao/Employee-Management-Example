package com.bhoj.struts.sevice.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bhoj.struts.forms.EmployeeForm;
import com.bhoj.struts.model.Employee;
import com.bhoj.struts.sevice.EmployeeService;
import com.bhoj.struts.sevice.dao.DataBaseConnection;

/**
 * @author Bhoj Sao
 *
 */
public class EmployeeServiceImpl implements EmployeeService {
	Connection dbConnection = null;

	public Integer saveEmpolyee(EmployeeForm employeeForm) {
		String userName = employeeForm.getUserName();
		String password = employeeForm.getPassword();
		String employeeFirstName = employeeForm.getEmployeeFirstName();
		String employeeLastName = employeeForm.getEmployeeLastName();
		String employeeHireDate = employeeForm.getEmployeeHireDate();
		String gender = employeeForm.getGender();
		String email = employeeForm.getEmail();
		String address = employeeForm.getAddress();
		String contactNumber = employeeForm.getContactNumber();
		Integer value = 0;
		try {
			dbConnection = DataBaseConnection.getDBConnection();
			Statement stmt = dbConnection.createStatement();
			value = stmt.executeUpdate(
					"INSERT INTO EMPLOYEE (USER_NAME, PASSWORD, EMPLOYEE_FIRST_NAME,EMPLOYEE_LAST_NAME,EMPLOYEE_HIRE_DATE,GENDER,EMAIL,ADDRESS,CONTACT_NUMBER)"
							+ "VALUES('" + userName + "','" + password + "','" + employeeFirstName + "','"
							+ employeeLastName + "','" + employeeHireDate + "','" + gender + "','" + email + "','"
							+ address + "','" + contactNumber + "')");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				dbConnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("1 row affected" + value);
		return value;
	}

	@Override
	public List<Employee> getEmployeeDetails() {
		String userName = null;
		String employeeFirstName = null;
		String employeeLastName = null;
		String employeeHireDate = null;
		String gender = null;
		String email = null;
		String address = null;
		String contactNumber = null;
		List<Employee> employeeList=new ArrayList<Employee>();
		try {
			dbConnection = DataBaseConnection.getDBConnection();
			Statement stmt = dbConnection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from EMPLOYEE ORDER BY USER_NAME");
			if (rs != null) {
				while (rs.next()) {
					userName = rs.getString("USER_NAME");
					employeeFirstName = rs.getString("EMPLOYEE_FIRST_NAME");
					employeeLastName = rs.getString("EMPLOYEE_LAST_NAME");
					employeeHireDate = rs.getString("EMPLOYEE_HIRE_DATE");
					gender = rs.getString("GENDER");
					email = rs.getString("EMAIL");
					address = rs.getString("ADDRESS");
					contactNumber = rs.getString("CONTACT_NUMBER");
					employeeList.add(new Employee(userName, employeeFirstName, employeeLastName, employeeHireDate, gender, email,
							address, contactNumber));
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
		return employeeList;
	}

}
