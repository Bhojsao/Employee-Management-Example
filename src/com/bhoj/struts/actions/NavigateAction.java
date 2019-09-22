package com.bhoj.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 * @author Bhoj Sao
 *
 */
public class NavigateAction extends DispatchAction {
	private final static String EMPLOYEE = "employee";
	private final static String EMPLOYEELIST = "employeeList";

	public ActionForward addEmployee(ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return actionMapping.findForward(EMPLOYEE);
	}

	public ActionForward getEmployeeDetails(ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return actionMapping.findForward(EMPLOYEELIST);
	}
}
