package presentation;

import java.io.Serializable;

import business.LoginBusiness;
import model.Login;

public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Login logins;
	LoginBusiness lb;

	/**
	 * @return the logins
	 */
	public Login getLogins() {
		return logins;
	}

	/**
	 * @param logins the logins to set
	 */
	public void setLogins(Login logins) {
		this.logins = logins;
	}

	public LoginBean(Login logins) {

		this.logins = logins;
	}

	public LoginBean() {

	}
}
