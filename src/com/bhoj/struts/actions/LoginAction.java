package com.bhoj.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bhoj.struts.forms.LoginForm;
import com.bhoj.struts.sevice.LoginService;
import com.bhoj.struts.sevice.impl.LoginServiceImpl;

/**
 * @author Bhoj Sao
 *
 */
public class LoginAction extends Action {
	private final static String FAILURE = "failure";
	private final static String HOME = "home";

	LoginService loginService = new LoginServiceImpl();

	/**
	 * This is the action called from the Struts framework.
	 * 
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm loginForm = (LoginForm) form;
		boolean validateEmpolyee = loginService.validateEmpolyee(loginForm.getUserName(), loginForm.getPassword());
		if (validateEmpolyee) {
			return mapping.findForward(HOME);
		} else {
			return mapping.findForward(FAILURE);
		}
	}

}
