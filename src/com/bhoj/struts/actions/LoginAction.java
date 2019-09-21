package com.bhoj.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bhoj.struts.forms.LoginForm;

/**
 * @author Bhoj Sao
 *
 */
public class LoginAction extends Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	/**
	 * This is the action called from the Struts framework.
	 * 
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm loginForm = (LoginForm) form;
		if (loginForm.getUserName().equals(loginForm.getPassword())) {
			return mapping.findForward(SUCCESS);
		} else {
			return mapping.findForward(FAILURE);
		}
	}

}
