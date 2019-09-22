package com.bhoj.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.bhoj.struts.forms.EmployeeForm;
import com.bhoj.struts.sevice.EmployeeService;
import com.bhoj.struts.sevice.impl.EmployeeServiceImpl;

/**
 * @author Bhoj Sao
 *
 */
public class EmployeeAction extends DispatchAction {

	private final static String EMPLOYEE = "employee";
	private final static String HOME = "home";
	EmployeeService employeeService=new EmployeeServiceImpl();

	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		EmployeeForm employeeForm=(EmployeeForm) actionForm;
		Integer saveEmpolyee = employeeService.saveEmpolyee(employeeForm);
		return actionMapping.findForward(HOME);
	}
}
