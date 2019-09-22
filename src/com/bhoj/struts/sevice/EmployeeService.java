package com.bhoj.struts.sevice;

import java.util.List;

import com.bhoj.struts.forms.EmployeeForm;
import com.bhoj.struts.model.Employee;

/**
 * @author Bhoj Sao
 *
 */
public interface EmployeeService {

	public Integer saveEmpolyee(EmployeeForm employeeForm);

	public List<Employee> getEmployeeDetails();
}
