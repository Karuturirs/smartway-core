package com.smartway.core.model;

import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USER_INFO")
public class UserInfo {
	
	@Id
	@Column(name = "USER_ID", unique = true, nullable = false)
	private int userId;
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;
	@Column(name = "BIRTH_DATE", nullable = false)
	private String birthDate;
	@Column(name = "PHONE", nullable = false)
	private String phone;
	@Column(name = "EMAIL", nullable = false)
	private String email;
	@Column(name = "GENDER", nullable = false)
	private char gender;
	@Column(name = "CRT_TS")
	private String crtTimeStamp;
	@Column(name = "UPD_TS")
	private String uptTimeStamp;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getCrtTimeStamp() {
		return crtTimeStamp;
	}
	public String getUptTimeStamp() {
		return uptTimeStamp;
	}
	public void setUptTimeStamp(String uptTimeStamp ) {
		//String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss").format(new java.util.Date());
		this.uptTimeStamp = uptTimeStamp;
	}
	
	
	

}
