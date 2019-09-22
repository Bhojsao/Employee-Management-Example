package com.bhoj.struts.model;

/**
 * @author Bhoj Sao
 *
 */
public class Employee {
	private String userName;
	private String password;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeHireDate;
	private String gender;
	private String email;
	private String address;
	private String contactNumber;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeHireDate() {
		return employeeHireDate;
	}
	public void setEmployeeHireDate(String employeeHireDate) {
		this.employeeHireDate = employeeHireDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Employee(String userName, String employeeFirstName, String employeeLastName, String employeeHireDate,
			String gender, String email, String address, String contactNumber) {
		super();
		this.userName = userName;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeHireDate = employeeHireDate;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.contactNumber = contactNumber;
	}

}
