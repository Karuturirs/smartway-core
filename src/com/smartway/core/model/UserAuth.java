package com.smartway.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the USER_AUTH database table.
 * 
 */
@Entity
@Table(name="USER_AUTH")
@NamedQuery(name="UserAuth.findAll", query="SELECT u FROM UserAuth u")
public class UserAuth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_NAME")
	private String userName;

	@Column(name="CRT_TS")
	private Timestamp crtTs;

	private String password;

	@Column(name="UPD_TS")
	private Timestamp updTs;

	//bi-directional many-to-one association to UserInfo
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private UserInfo userInfo;

	public UserAuth() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getCrtTs() {
		return this.crtTs;
	}

	public void setCrtTs(Timestamp crtTs) {
		this.crtTs = crtTs;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getUpdTs() {
		return this.updTs;
	}

	public void setUpdTs(Timestamp updTs) {
		this.updTs = updTs;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}