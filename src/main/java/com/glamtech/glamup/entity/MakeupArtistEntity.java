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
@Table(name = "makupArtist_table")
@NamedQuery(name = "MakeupArtistEntity.getEmail", query = "select entity.email from MakeupArtistEntity entity where entity.email=:loginEmail")
@NamedQuery(name = "MakeupArtistEntity.getEncodedPasswordByEmail", query = "select entity.password from MakeupArtistEntity entity where entity.email=:loginEmail")
@NamedQuery(name = "MakeupArtistEntity.getNoOfLoginAttemptByEmail", query = "select entity.noOfLoginAttempt from MakeupArtistEntity entity where entity.email=:loginEmail")
@NamedQuery(name = "MakeupArtistEntity.updateLoginAttemptByEmail", query = "update MakeupArtistEntity entity set entity.noOfLoginAttempt=:loginAttempt where entity.email=:loginEmail")
public class MakeupArtistEntity implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MAKEUP_ARTIST_ID")
	private Long makupArtistID;

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

	public MakeupArtistEntity() {
		super();
	}

	public Long getMakupArtistID() {
		return makupArtistID;
	}

	public void setMakupArtistID(Long makupArtistID) {
		this.makupArtistID = makupArtistID;
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
		return "MakeupArtistEntity [makupArtistID=" + makupArtistID + ", businessType=" + businessType + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", mobileNo=" + mobileNo + ", password="
				+ password + ", address=" + address + ", bioData=" + bioData + ", noOfLoginAttempt=" + noOfLoginAttempt
				+ "]";
	}

}
