package com.glamtech.glamup.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.glamtech.glamup.constant.Vendor;

public class LoginDTO {

	@NotNull(message = "vendorType cannot be empty")
	private Vendor vendorType;

	@NotEmpty(message = "email field cannot be empty")
	@NotNull
	@Email(message = "Invalid Email")
	private String email;

	@NotEmpty(message = "password field cannot be empty")
	@NotNull
	private String password;

	public Vendor getVendorType() {
		return vendorType;
	}

	public void setVendorType(Vendor vendorType) {
		this.vendorType = vendorType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [vendorType=" + vendorType + ", email=" + email + ", password=" + password + "]";
	}

	

}
