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

import com.glamtech.glamup.dto.VendorRegisterDTO;
import com.glamtech.glamup.service.VendorRegisterService;

@Controller
public class VendorRegisterController {

	private static final Logger logger = LogManager.getLogger(VendorRegisterController.class);

	@Autowired
	private VendorRegisterService vendorRegisterService;

	public VendorRegisterController() {
		logger.info(this.getClass().getSimpleName() + " Bean created");
	}

	@RequestMapping(value = "/register/vendor", method = RequestMethod.POST)
	public String onRegisterClick(@Valid @ModelAttribute("vendorRegisterDTO") VendorRegisterDTO vendorRegisterDTO,
			BindingResult bindingResult,Model model) {
		logger.info("invoked onRegisterClicked from VendorRegisterController" + vendorRegisterDTO);

		if (bindingResult.hasErrors()) {
			return "RegisterPage";
		}
		boolean isSaved = this.vendorRegisterService.saveVendorRegister(vendorRegisterDTO);
		if (isSaved) {
		     model.addAttribute("registerMessage", "Registration completed successfully");
			return "RegisterPage";
		}
		 model.addAttribute("registerMessage", "Registration failed,try again");
		return "RegisterPage";

	}

}
