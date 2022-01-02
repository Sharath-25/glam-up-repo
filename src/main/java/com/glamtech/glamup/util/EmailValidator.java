package com.glamtech.glamup.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmailValidator {
	private static final Logger logger = LogManager.getLogger(EmailValidator.class);

	public static boolean isValidEmailAddress(String email) {
		logger.info("Invoked isValidEmailAddress()");
		boolean flag = true;
		try {
			InternetAddress internetAddress = new InternetAddress(email);
			internetAddress.validate();
		} catch (AddressException addressException) {
			flag = false;
			logger.warn("isValidEmailAddress() thrown an Exception, check the logs");
			logger.error("email is " + addressException.getMessage());
		}
		return flag;
	}

	public static boolean isEmailEmpty(String email) {
		logger.info("Invoked isEmailEmpty()");
		boolean flag = false;
		try {
			if (!email.isEmpty() && email != null) {
				flag = true;
			}
		} catch (Exception exception) {
			logger.warn("isEmailEmpty() thrown an Exception, check the logs");
			logger.warn("email is " + exception.getMessage());
		}
		return flag;

	}

	public static boolean validateEmail(String userEmail) {
		logger.info("Invoked validateEmail()");
		boolean flag = false;
		List<String> emails = new ArrayList<String>();

		emails.add("java@domain.co.in");
		emails.add("java@gmail.com");
		emails.add("java.name@domain.com");
		emails.add("java#@domain.co.in");
		
		// Add invalid emails in list
		
		emails.add(".javaTpoint@yahoo.com");
		emails.add("java@yahoo.com.");
		emails.add("java@yahoo..com");
		emails.add("javat@yahoo.c");
		emails.add("java@yahoo.corporate");
		emails.add("java'Tpoint@domain.com");
		
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
		
		Pattern pattern = Pattern.compile(regex);
		
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			flag = matcher.matches();

		}
		return flag;

	}
}
