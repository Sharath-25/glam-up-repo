package com.glamtech.glamup.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glamtech.glamup.dao.OTPDAO;
import com.glamtech.glamup.entity.OTPEntity;

@Service
public class OTPServiceImpl implements OTPService {

	private static final Logger logger = LogManager.getLogger(OTPServiceImpl.class);

	@Autowired
	private OTPDAO otpDao;

	public OTPServiceImpl() {
		logger.info(this.getClass().getSimpleName() + " Object Created");
	}

	@Override
	public boolean validateOTP(String otp) {
		logger.info("Invoked validateOTP()");
		boolean flag = false;
		try {
			if (!otp.isEmpty() && otp != null) {
				flag = true;
			}
		} catch (Exception exception) {
			logger.warn("validateOTP() thrown an Exception, check the logs");
			logger.warn("otp is " + exception.getMessage());
		}
		return flag;
	}

	@Override
	public boolean saveOTP(String otp, String email) {
		OTPEntity otpEntity = new OTPEntity(otp, email);
		boolean flag = true;
		try {
			this.otpDao.save(otpEntity);
		} catch (Exception exception) {
			flag = false;
			logger.error(exception.getMessage());
		}
		return flag;
	}

	@Override
	public String getOTP(String email) {
		String otp = null;
		try {
			otp = this.otpDao.getOTPByEmail(email);
			if (otp != null) {
				return otp;
			}
		} catch (Exception exception) {
			logger.error(exception.getMessage());
		}
		return otp;
	}

	@Override
	public boolean checkEmailFromDB(String email) {
		boolean flag = false;
		try {
			String emailFromDB = this.otpDao.verifyEmail(email);
			if (emailFromDB.equals(email)) {
				flag = true;
				return flag;
			}
		} catch (Exception exception) {
			logger.error(exception.getMessage());
		}
		return flag;
	}

}
