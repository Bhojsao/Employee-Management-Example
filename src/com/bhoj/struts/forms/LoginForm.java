package com.bhoj.struts.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * @author Bhoj Sao
 *
 */
public class LoginForm extends ActionForm {

	private static final long serialVersionUID = 3011799872287841118L;

	private String userName;
	private String password;

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

	public LoginForm() {
		super();
	}

	/**
	 * This is the action called from the Struts framework.
	 * 
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		if (userName == null || userName.length() < 1) {
			actionErrors.add("userName", new ActionMessage("error.userName.required"));
		}
		if (password == null || password.length() < 1) {
			actionErrors.add("password", new ActionMessage("error.password.required"));
		}
		return actionErrors;
	}

}
