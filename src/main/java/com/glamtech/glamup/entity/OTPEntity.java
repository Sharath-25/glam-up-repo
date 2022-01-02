package com.glamtech.glamup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "otp_table")
@NamedQuery(name = "OTPEntity.getOTPByEmail", query = "select entity.otp from OTPEntity entity where entity.email=:emailID")
@NamedQuery(name = "OTPEntity.verifyEmail", query = "select entity.email from OTPEntity entity where entity.email=:emailID ")
public class OTPEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OTP_ID")
	private Long otpID;

	@Column(name = "OTP")
	private String otp;

	@Column(name = "EMAIL")
	private String email;

	public OTPEntity() {
		super();
	}

	public OTPEntity(String otp, String email) {
		super();
		this.otp = otp;
		this.email = email;
	}

	public Long getOtpID() {
		return otpID;
	}

	public void setOtpID(Long otpID) {
		this.otpID = otpID;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "OTPEntity [otp=" + otp + ", email=" + email + "]";
	}

}
