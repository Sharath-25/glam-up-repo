package com.glamtech.glamup.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordTransmitter {

	private static final Logger logger = LogManager.getLogger(PasswordTransmitter.class);

	@Autowired
	private PasswordEncoder passwordEncoder;

	public PasswordTransmitter() {
		logger.debug(this.getClass().getSimpleName() + " Object Created");
	}

	public String encodePassword(String rawPassword) {
		logger.info("Invoked encodePassword()");
		String encodedPassword = this.passwordEncoder.encode(rawPassword);
		logger.info("rawPassword is encoded-->" + encodedPassword);
		return encodedPassword;

	}

	public boolean verifyEncodedPassword(String rawPassword, String encodedPassword) {
		logger.debug("Invoked verifyEncodedPassword() ");
		return this.passwordEncoder.matches(rawPassword, encodedPassword);

	}

}
