package com.glamtech.glamup.controller;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.glamtech.glamup.dto.LoginDTO;
import com.glamtech.glamup.service.LoginService;

@Controller
public class LoginController {
	private static final Logger logger = LogManager.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	public LoginController() {
		super();
		logger.info(this.getClass().getSimpleName() + " Bean created");
	}

	@RequestMapping(value = "/getLoginpage", method = RequestMethod.GET)
	public String getLoginPage(@ModelAttribute("loginDTO") LoginDTO loginDTO) {
		logger.debug("Invoked getLoginPage()");
		return "LoginPage";
	}

	@RequestMapping(value = "/onloginClick", method = RequestMethod.POST)
	public String onLoginClicked(@Valid @ModelAttribute("loginDTO") LoginDTO loginDTO, BindingResult bindingResult,
			Model model) {
		logger.debug("Invoked onLoginClicked()");
		logger.debug(loginDTO);
		if (bindingResult.hasErrors()) {
			return "LoginPage";
		}
		boolean isLoginCountCorrect = this.loginService.verifyLoginCountByVendor(loginDTO.getEmail(),
				loginDTO.getVendorType());
		if (!isLoginCountCorrect) {
			model.addAttribute("errorMessage", "Account has been blocked.Reset your password and login again");
			return "LoginPage";
		}

		boolean isEmailVerified = this.loginService.verifyLoginEmailByVendor(loginDTO.getEmail(),
				loginDTO.getVendorType());
		boolean isPasswordVerified = this.loginService.verifyLoginPasswordByVendor(loginDTO);
		if (isEmailVerified && isPasswordVerified) {
			logger.info("Email & Password is correct");
			return "HomePage";
		}

		this.loginService.updateLoginAttempt(loginDTO.getEmail(), loginDTO.getVendorType());
		model.addAttribute("errorMessage", "Email or Password is wrong");
		return "LoginPage";

	}

	@ModelAttribute("loginDTO")
	public LoginDTO defaultInstance() {
		System.out.println("invoked defaultInstance ");
		LoginDTO loginDTO = new LoginDTO();
		return loginDTO;
	}

}
