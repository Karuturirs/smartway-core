package com.smartway.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_auth database table.
 * 
 */
@Entity
@Table(name="user_auth")
@NamedQuery(name="UserAuth.findAll", query="SELECT u FROM UserAuth u")
public class UserAuth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_NAME")
	private String userName;

	private String password;

	@Column(name="UPD_TS")
	private Timestamp updTs;

	@Column(name="USER_ID")
	private int userId;

	//bi-directional one-to-one association to UserInfo
	@OneToOne
	@JoinColumn(name="USER_NAME")
	private UserInfo userInfo;

	public UserAuth() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}