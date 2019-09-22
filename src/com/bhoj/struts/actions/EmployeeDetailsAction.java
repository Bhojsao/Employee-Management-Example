package com.bhoj.struts.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.bhoj.struts.forms.EmployeeDetailsForm;
import com.bhoj.struts.model.Employee;
import com.bhoj.struts.sevice.EmployeeService;
import com.bhoj.struts.sevice.impl.EmployeeServiceImpl;

/**
 * @author Bhoj Sao
 *
 */
public class EmployeeDetailsAction extends DispatchAction {

	private final static String EMPLOYEELIST = "employeeList";
	EmployeeService employeeService=new EmployeeServiceImpl();

	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		EmployeeDetailsForm employeeDetailsForm=(EmployeeDetailsForm) actionForm;
		List<Employee> employeeList = employeeService.getEmployeeDetails();
		employeeDetailsForm.setEmployeeList(employeeList);
		return actionMapping.findForward(EMPLOYEELIST);
	}
}
