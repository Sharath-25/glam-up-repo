package com.glamtech.glamup.util;

import java.util.Date;
import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailAuthenticationException;
import org.springframework.mail.MailParseException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class MailDispatcher {
	private static final Logger logger = LogManager.getLogger(MailDispatcher.class);

	@Autowired
	private  MailSender mailSender;

	public MailDispatcher() {
		logger.info(this.getClass().getSimpleName() + " Object created");
	}

	public  boolean sendOTP(String email, String otp) {
		logger.info("Invoked sendOTP()");
		boolean flag = true;
		try {
			if (Objects.nonNull(email) && Objects.nonNull(otp)) {
				SimpleMailMessage mailMessage = new SimpleMailMessage();
				mailMessage.setTo(email);
				mailMessage.setSubject("OTP Verification");
				mailMessage.setText("Your OTP to register/access Glamup is " + otp);
				mailMessage.setSentDate(new Date());
				this.mailSender.send(mailMessage);
				logger.info("OTP sending is completed!!");
			}
		} catch (MailAuthenticationException | MailParseException | MailSendException  exception) {
			flag = false;
			logger.error(exception.getMessage());
			logger.error("OTP is not sent..check the logs");
		}
		return flag;

	}
}
