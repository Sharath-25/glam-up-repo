package com.glamtech.glamup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.glamtech.glamup.constant.Vendor;

@Entity
@Table(name = "photographer_table")
@NamedQuery(name = "PhotographerEntity.getEmail", query = "select entity.email from PhotographerEntity entity where entity.email=:loginEmail")
@NamedQuery(name = "PhotographerEntity.getEncodedPasswordByEmail", query = "select entity.password from PhotographerEntity entity where entity.email=:loginEmail")
@NamedQuery(name = "PhotographerEntity.getNoOfLoginAttemptByEmail", query = "select entity.noOfLoginAttempt from PhotographerEntity entity where entity.email=:loginEmail")
@NamedQuery(name = "PhotographerEntity.updateLoginAttemptByEmail", query = "update PhotographerEntity entity set entity.noOfLoginAttempt=:loginAttempt where entity.email=:loginEmail")
public class PhotographerEntity implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PHOTOGRAPHER_ID")
	private Long photographerID;

	@Column(name = "BUSINESS_TYPE")
	private Vendor businessType;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILE_NO")
	private String mobileNo;

	@Column(name = "PASSWORD", length = 100)
	private String password;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "BIO_DATA")
	private String bioData;

	@Column(name = "LOGIN_ATTEMPT")
	private int noOfLoginAttempt;

	public PhotographerEntity() {
		super();
	}

	public Long getPhotographerID() {
		return photographerID;
	}

	public void setPhotographerID(Long photographerID) {
		this.photographerID = photographerID;
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

	public int getNoOfLoginAttempt() {
		return noOfLoginAttempt;
	}

	public void setNoOfLoginAttempt(int noOfLoginAttempt) {
		this.noOfLoginAttempt = noOfLoginAttempt;
	}

	@Override
	public String toString() {
		return "PhotographerEntity [photographerID=" + photographerID + ", businessType=" + businessType
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", password=" + password + ", address=" + address + ", bioData=" + bioData + ", noOfLoginAttempt="
				+ noOfLoginAttempt + "]";
	}

}
