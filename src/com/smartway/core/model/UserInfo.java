package com.smartway.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user_info database table.
 * 
 */
@Entity
@Table(name="user_info")
@NamedQuery(name="UserInfo.findAll", query="SELECT u FROM UserInfo u")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_NAME")
	private String userName;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CRT_DT")
	private Date crtDt;

	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	private String gender;

	@Column(name="LAST_NAME")
	private String lastName;

	private String phone;

	@Column(name="UPD_TS")
	private Timestamp updTs;

	@Column(name="USER_ID")
	private int userId;

	//bi-directional many-to-one association to ListUserDevice
	@OneToMany(mappedBy="userInfo")
	private List<ListUserDevice> listUserDevices;

	//bi-directional one-to-one association to UserAuth
	@OneToOne(mappedBy="userInfo")
	private UserAuth userAuth;

	public UserInfo() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getCrtDt() {
		return this.crtDt;
	}

	public void setCrtDt(Date crtDt) {
		this.crtDt = crtDt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public List<ListUserDevice> getListUserDevices() {
		return this.listUserDevices;
	}

	public void setListUserDevices(List<ListUserDevice> listUserDevices) {
		this.listUserDevices = listUserDevices;
	}

	public ListUserDevice addListUserDevice(ListUserDevice listUserDevice) {
		getListUserDevices().add(listUserDevice);
		listUserDevice.setUserInfo(this);

		return listUserDevice;
	}

	public ListUserDevice removeListUserDevice(ListUserDevice listUserDevice) {
		getListUserDevices().remove(listUserDevice);
		listUserDevice.setUserInfo(null);

		return listUserDevice;
	}

	public UserAuth getUserAuth() {
		return this.userAuth;
	}

	public void setUserAuth(UserAuth userAuth) {
		this.userAuth = userAuth;
	}

}