package com.smartway.core.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the USER_INFO database table.
 * 
 */
@Entity
@Table(name="USER_INFO")
@NamedQuery(name="UserInfo.findAll", query="SELECT u FROM UserInfo u")
public class UserInfo implements Serializable {
	
	private static final long serialVersionUID = 649734565057802740L;

	@GeneratedValue
	@Id
	@Column(name="USER_ID")
	private int userId;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	private String gender;

	@Column(name="LAST_NAME")
	private String lastName;

	private String phone;

	@Column(name="UPD_TS")
	private Timestamp updTs;

	//bi-directional many-to-one association to ListUserDevice
	@OneToMany(mappedBy="userInfo", fetch=FetchType.LAZY)
	private List<ListUserDevice> listUserDevices;

	//bi-directional many-to-one association to UserAuth
	@OneToMany(mappedBy="userInfo", fetch=FetchType.LAZY)
	private List<UserAuth> userAuths;

	public UserInfo() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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

	public List<UserAuth> getUserAuths() {
		return this.userAuths;
	}

	public void setUserAuths(List<UserAuth> userAuths) {
		this.userAuths = userAuths;
	}

	public UserAuth addUserAuth(UserAuth userAuth) {
		getUserAuths().add(userAuth);
		userAuth.setUserInfo(this);

		return userAuth;
	}

	public UserAuth removeUserAuth(UserAuth userAuth) {
		getUserAuths().remove(userAuth);
		userAuth.setUserInfo(null);

		return userAuth;
	}

}