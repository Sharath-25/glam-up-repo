package com.glamtech.glamup.service;

public interface OTPService {

	boolean validateOTP(String otp);

	boolean saveOTP(String otp,String email);

	String getOTP(String email);
	
	boolean checkEmailFromDB(String email);

}
