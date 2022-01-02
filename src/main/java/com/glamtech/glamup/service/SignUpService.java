package com.glamtech.glamup.service;

public interface SignUpService {
	String getOTP();

	boolean sendOTP(String email,String otp);
	
	boolean validateEmail(String email);
	
	
}
