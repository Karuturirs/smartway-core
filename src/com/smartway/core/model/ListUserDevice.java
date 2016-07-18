package com.smartway.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the LIST_USER_DEVICES database table.
 * 
 */
@Entity
@Table(name="LIST_USER_DEVICES")
@NamedQuery(name="ListUserDevice.findAll", query="SELECT l FROM ListUserDevice l")
public class ListUserDevice implements Serializable {
	
	private static final long serialVersionUID = 1539761765029241482L;

	@Id
	@Column(name="ITEM_ID")
	private String itemId;

	private String col1;

	private String col10;

	private String col10type;

	private String col1type;

	private String col2;

	private String col2type;

	private String col3;

	private String col3type;

	private String col4;

	private String col4type;

	private String col5;

	private String col5type;

	private String col6;

	private String col6type;

	private String col7;

	private String col7type;

	private String col8;

	private String col8type;

	private String col9;

	private String col9type;

	
	private int id;

	@Column(name="ITEM_DESC")
	private String itemDesc;

	@Column(name="ITEM_NAME")
	private String itemName;

	@Column(name="ITEM_STATE")
	private String itemState;

	@Column(name="UPD_TS")
	private Timestamp updTs;

	//bi-directional many-to-one association to UserInfo
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private UserInfo userInfo;

	//bi-directional many-to-one association to DevicesData
	@OneToMany(mappedBy="listUserDevice")
	private List<DevicesData> devicesData;

	public ListUserDevice() {
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getCol1() {
		return this.col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}

	public String getCol10() {
		return this.col10;
	}

	public void setCol10(String col10) {
		this.col10 = col10;
	}

	public String getCol10type() {
		return this.col10type;
	}

	public void setCol10type(String col10type) {
		this.col10type = col10type;
	}

	public String getCol1type() {
		return this.col1type;
	}

	public void setCol1type(String col1type) {
		this.col1type = col1type;
	}

	public String getCol2() {
		return this.col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}

	public String getCol2type() {
		return this.col2type;
	}

	public void setCol2type(String col2type) {
		this.col2type = col2type;
	}

	public String getCol3() {
		return this.col3;
	}

	public void setCol3(String col3) {
		this.col3 = col3;
	}

	public String getCol3type() {
		return this.col3type;
	}

	public void setCol3type(String col3type) {
		this.col3type = col3type;
	}

	public String getCol4() {
		return this.col4;
	}

	public void setCol4(String col4) {
		this.col4 = col4;
	}

	public String getCol4type() {
		return this.col4type;
	}

	public void setCol4type(String col4type) {
		this.col4type = col4type;
	}

	public String getCol5() {
		return this.col5;
	}

	public void setCol5(String col5) {
		this.col5 = col5;
	}

	public String getCol5type() {
		return this.col5type;
	}

	public void setCol5type(String col5type) {
		this.col5type = col5type;
	}

	public String getCol6() {
		return this.col6;
	}

	public void setCol6(String col6) {
		this.col6 = col6;
	}

	public String getCol6type() {
		return this.col6type;
	}

	public void setCol6type(String col6type) {
		this.col6type = col6type;
	}

	public String getCol7() {
		return this.col7;
	}

	public void setCol7(String col7) {
		this.col7 = col7;
	}

	public String getCol7type() {
		return this.col7type;
	}

	public void setCol7type(String col7type) {
		this.col7type = col7type;
	}

	public String getCol8() {
		return this.col8;
	}

	public void setCol8(String col8) {
		this.col8 = col8;
	}

	public String getCol8type() {
		return this.col8type;
	}

	public void setCol8type(String col8type) {
		this.col8type = col8type;
	}

	public String getCol9() {
		return this.col9;
	}

	public void setCol9(String col9) {
		this.col9 = col9;
	}

	public String getCol9type() {
		return this.col9type;
	}

	public void setCol9type(String col9type) {
		this.col9type = col9type;
	}

	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemState() {
		return this.itemState;
	}

	public void setItemState(String itemState) {
		this.itemState = itemState;
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

	public List<DevicesData> getDevicesData() {
		return this.devicesData;
	}

	public void setDevicesData(List<DevicesData> devicesData) {
		this.devicesData = devicesData;
	}

	public DevicesData addDevicesData(DevicesData devicesData) {
		getDevicesData().add(devicesData);
		devicesData.setListUserDevice(this);

		return devicesData;
	}

	public DevicesData removeDevicesData(DevicesData devicesData) {
		getDevicesData().remove(devicesData);
		devicesData.setListUserDevice(null);

		return devicesData;
	}

}