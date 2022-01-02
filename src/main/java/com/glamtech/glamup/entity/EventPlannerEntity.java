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
@Table(name = "eventplanner_table")
@NamedQuery(name = "EventPlannerEntity.getEmail", query = "select entity.email from EventPlannerEntity entity where entity.email=:loginEmail")
@NamedQuery(name = "EventPlannerEntity.getEncodedPasswordByEmail", query = "select entity.password from EventPlannerEntity entity where entity.email=:loginEmail")
@NamedQuery(name = "EventPlannerEntity.getNoOfLoginAttemptByEmail", query = "select entity.noOfLoginAttempt from EventPlannerEntity entity where entity.email=:loginEmail")
@NamedQuery(name = "EventPlannerEntity.updateLoginAttemptByEmail", query = "update EventPlannerEntity entity set entity.noOfLoginAttempt=:loginAttempt where entity.email=:loginEmail")
public class EventPlannerEntity implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EVENTPLANNER_ID")
	private Long eventplannerID;

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

	public EventPlannerEntity() {
		super();
	}

	public Long getEventplannerID() {
		return eventplannerID;
	}

	public void setEventplannerID(Long eventplannerID) {
		this.eventplannerID = eventplannerID;
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
	
	
}
