package com.glamtech.glamup.util;

import java.util.Random;

public class OTPGenerator {

	public static String generateOTP() {
		Random random = new Random();
		String otp = String.format("%04d", random.nextInt(10000));
		return otp;

	}
}
