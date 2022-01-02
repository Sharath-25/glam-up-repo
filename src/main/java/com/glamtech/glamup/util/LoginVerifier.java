package com.glamtech.glamup.util;

import org.springframework.stereotype.Component;

@Component()
public class LoginVerifier {

	public boolean verifyEmail(String loginEmail, String databaseEmail) {
		if (loginEmail.equals(databaseEmail)) {
			return true;
		}
		return false;

	}

	public boolean verifyLoginAttempt(Integer noOfLoginAttempt) {
		if (noOfLoginAttempt < 3) {
			return true;
		}
		return false;
	}

	
}
