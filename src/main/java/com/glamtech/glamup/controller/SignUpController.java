package com.glamtech.glamup.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.glamtech.glamup.service.OTPService;
import com.glamtech.glamup.service.SignUpService;

@Controller
public class SignUpController {

	private static final Logger logger = LogManager.getLogger(SignUpController.class);

	private String email;

	@Autowired
	private SignUpService signUpService;

	@Autowired
	private OTPService otpService;

	public SignUpController() {
		logger.info(this.getClass().getSimpleName() + " Bean created");
	}

	public String getEmail() {
		return email;
	}

	@RequestMapping(value = "/signUpClick", method = RequestMethod.GET)
	public String onSignUpClicked() {
		logger.info("Invoked onSignInClicked()");
		return "SignUpPage";
	}

	@RequestMapping(value = "/getEmail", method = RequestMethod.POST)
	public String getEmail(@RequestParam(required = false) String email, Model model) {
		logger.info("Invoked getEmail()");

		boolean outcome = this.signUpService.validateEmail(email);
		if (!outcome) {
			model.addAttribute("message", "Invalid Email");
			return "SignUpPage";
		}
		this.email = email;

		boolean isEmailPresent = this.otpService.checkEmailFromDB(email);
		if (isEmailPresent) {
			model.addAttribute("message", "Email ID already exists");
			return "SignUpPage";

		}
		String otp = this.signUpService.getOTP();
		boolean isOTPMailed = this.signUpService.sendOTP(email, otp);
		boolean isOTPSaved = this.otpService.saveOTP(otp, email);

		return isOTPMailed && isOTPSaved ? "OTPPage" : "SignUpPage";
	}

}
