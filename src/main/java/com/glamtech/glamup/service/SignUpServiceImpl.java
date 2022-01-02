package com.glamtech.glamup.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glamtech.glamup.util.EmailValidator;
import com.glamtech.glamup.util.MailDispatcher;
import com.glamtech.glamup.util.OTPGenerator;

@Service
public class SignUpServiceImpl implements SignUpService {

	private static final Logger logger = LogManager.getLogger(SignUpServiceImpl.class);

	@Autowired
	private MailDispatcher mailDispatcher;

	public SignUpServiceImpl() {
		logger.info(this.getClass().getSimpleName() + " Bean created");
	}

	@Override
	public String getOTP() {
		logger.info("Invoked getOTP");
		String otp = OTPGenerator.generateOTP();
		return otp;
	}

	@Override
	public boolean sendOTP(String email, String otp) {
		logger.info("Invoked sendOTP() from SignUpServiceImpl");
		boolean outcome = this.mailDispatcher.sendOTP(email, otp);
		return outcome ? true : false;
	}

	@Override
	public boolean validateEmail(String email) {
		boolean flag = false;
		flag = EmailValidator.isEmailEmpty(email);
		flag = EmailValidator.validateEmail(email);
		flag = EmailValidator.isValidEmailAddress(email);

		return flag;

	}

}
