package com.smartway.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USER_AUTH")
public class UserAuth {
	
	@Id
	@Column(name = "USER_ID", nullable = false)
	private int userId;
	@Column(name = "USER_NAME", unique = true, nullable = false)
	private String userName;
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	@Column(name = "CRT_TS" )
	private String crtTimeStamp;
	@Column(name = "UPD_TS")
	private String uptTimeStamp;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCrtTimeStamp() {
		return crtTimeStamp;
	}
	public void setCrtTimeStamp(String crtTimeStamp) {
		this.crtTimeStamp = crtTimeStamp;
	}
	public String getUptTimeStamp() {
		return uptTimeStamp;
	}
	public void setUptTimeStamp(String uptTimeStamp) {
		this.uptTimeStamp = uptTimeStamp;
	}
	
	
}
