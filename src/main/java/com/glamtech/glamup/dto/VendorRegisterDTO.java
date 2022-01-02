package com.glamtech.glamup.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.glamtech.glamup.constant.Vendor;

public class VendorRegisterDTO {

	@NotNull(message = "businessType cannot be empty")
	private Vendor businessType;

	@NotEmpty(message = "firstName cannot be empty")
	@NotNull
	private String firstName;

	@NotEmpty(message = "lastName cannot be empty")
	@NotNull
	private String lastName;

	@NotEmpty(message = "email cannot be empty")
	@NotNull
	@Email(message = "Invalid Email")
	private String email;

	@NotEmpty(message = "mobileNo cannot be empty")
	@NotNull
	private String mobileNo;

	@NotEmpty(message = "password cannot be empty")
	@NotNull
	private String password;

	@NotEmpty(message = "confirmPassword cannot be empty")
	@NotNull
	private String confirmPassword;

	@NotEmpty(message = "address cannot be empty")
	@NotNull
	private String address;

	@NotEmpty(message = "bioData cannot be empty")
	@NotNull
	private String bioData;

	public VendorRegisterDTO() {
		super();
	}

	public Vendor getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Vendor businessType) {
		this.businessType = businessType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBioData() {
		return bioData;
	}

	public void setBioData(String bioData) {
		this.bioData = bioData;
	}

	@Override
	public String toString() {
		return "VendorRegisterDTO [businessType=" + businessType + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", mobileNo=" + mobileNo + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", address=" + address + ", bioData=" + bioData + "]";
	}

}
