package com.bhoj.struts.forms;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.bhoj.struts.model.Employee;

/**
 * @author Bhoj Sao
 *
 */
public class EmployeeDetailsForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private List<Employee> employeeList;

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
