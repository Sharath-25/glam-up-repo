package com.glamtech.glamup.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.glamtech.glamup.dto.VendorRegisterDTO;
import com.glamtech.glamup.service.OTPService;

@Controller
public class OTPController {
	private static final Logger logger = LogManager.getLogger(OTPController.class);
	@Autowired
	private OTPService otpService;
	
	@Autowired
	private SignUpController signUpController;

	public OTPController() {
		logger.info(this.getClass().getSimpleName() + " Bean created");
	}

	@RequestMapping(value = "/onVerifyClicked", method = RequestMethod.POST)
	public String onVerifyClick(@RequestParam(required = false) String otp, Model model) {
		logger.info("Invoked onVerifyClicked()" + otp);
		boolean outcome = this.otpService.validateOTP(otp);
		if (outcome) {
			String otpFromDB = this.otpService.getOTP(this.signUpController.getEmail());
			if (otpFromDB != null) {
				if (otp.equals(otpFromDB)) {
					return "RegisterPage";
				}
			}
			model.addAttribute("validationMessage", "Invalid OTP");
		}
		model.addAttribute("validationMessage", "Invalid OTP");
		return "OTPPage";

	}

	@RequestMapping(value = "/register/vendor", method = RequestMethod.GET)
	public String serveRegisterPage(@ModelAttribute("vendorRegisterDTO") VendorRegisterDTO vendorRegisterDTO) {
		return "RegisterPage";

	}

	@ModelAttribute("vendorRegisterDTO")
	public VendorRegisterDTO defaultInstance() {
		System.out.println("invoked defaultInstance ");
		VendorRegisterDTO vendorRegisterDTO = new VendorRegisterDTO();
		return vendorRegisterDTO;
	}

}
