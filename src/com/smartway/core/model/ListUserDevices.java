package com.smartway.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIST_USER_DEVICES")
public class ListUserDevices {
	
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@Id
	@Column(name = "USER_ID", nullable = false)
	private int userId;
	@Id
	@Column(name = "ITEM_ID", nullable = false)
	private String itemId;
	@Column(name = "ITEM_NAME", nullable = false)
	private String itemName;
	@Column(name = "ITEM_STATE", nullable = false)
	private String itemState;
	@Column(name = "ITEM_DESC", nullable = false)
	private String itemDesc;
	@Column(name = "col1")
	private String col1;
	@Column(name = "col2")
	private String col2;
	@Column(name = "col3")
	private String col3;
	@Column(name = "col4")
	private String col4;
	@Column(name = "col5")
	private String col5;
	@Column(name = "col6")
	private String col6;
	@Column(name = "col7")
	private String col7;
	@Column(name = "col8")
	private String col8;
	@Column(name = "col9")
	private String col9;
	@Column(name = "col10")
	private String col10;
	@Column(name = "CRT_TS")
	private String crtTimeStamp;
	@Column(name = "UPD_TS")
	private String uptTimeStamp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemState() {
		return itemState;
	}
	public void setItemState(String itemState) {
		this.itemState = itemState;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public String getCol1() {
		return col1;
	}
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	public String getCol2() {
		return col2;
	}
	public void setCol2(String col2) {
		this.col2 = col2;
	}
	public String getCol3() {
		return col3;
	}
	public void setCol3(String col3) {
		this.col3 = col3;
	}
	public String getCol4() {
		return col4;
	}
	public void setCol4(String col4) {
		this.col4 = col4;
	}
	public String getCol5() {
		return col5;
	}
	public void setCol5(String col5) {
		this.col5 = col5;
	}
	public String getCol6() {
		return col6;
	}
	public void setCol6(String col6) {
		this.col6 = col6;
	}
	public String getCol7() {
		return col7;
	}
	public void setCol7(String col7) {
		this.col7 = col7;
	}
	public String getCol8() {
		return col8;
	}
	public void setCol8(String col8) {
		this.col8 = col8;
	}
	public String getCol9() {
		return col9;
	}
	public void setCol9(String col9) {
		this.col9 = col9;
	}
	public String getCol10() {
		return col10;
	}
	public void setCol10(String col10) {
		this.col10 = col10;
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
