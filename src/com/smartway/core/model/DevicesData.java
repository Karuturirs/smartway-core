package com.smartway.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the devices_data database table.
 * 
 */
@Entity
@Table(name="devices_data")
@NamedQuery(name="DevicesData.findAll", query="SELECT d FROM DevicesData d")
public class DevicesData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String col1;

	private String col10;

	private String col2;

	private String col3;

	private String col4;

	private String col5;

	private String col6;

	private String col7;

	private String col8;

	private String col9;

	@Column(name="IN_TS")
	private Timestamp inTs;

	@Column(name="UPD_TS")
	private Timestamp updTs;

	//bi-directional many-to-one association to ListUserDevice
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	private ListUserDevice listUserDevice;

	public DevicesData() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCol2() {
		return this.col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}

	public String getCol3() {
		return this.col3;
	}

	public void setCol3(String col3) {
		this.col3 = col3;
	}

	public String getCol4() {
		return this.col4;
	}

	public void setCol4(String col4) {
		this.col4 = col4;
	}

	public String getCol5() {
		return this.col5;
	}

	public void setCol5(String col5) {
		this.col5 = col5;
	}

	public String getCol6() {
		return this.col6;
	}

	public void setCol6(String col6) {
		this.col6 = col6;
	}

	public String getCol7() {
		return this.col7;
	}

	public void setCol7(String col7) {
		this.col7 = col7;
	}

	public String getCol8() {
		return this.col8;
	}

	public void setCol8(String col8) {
		this.col8 = col8;
	}

	public String getCol9() {
		return this.col9;
	}

	public void setCol9(String col9) {
		this.col9 = col9;
	}

	public Timestamp getInTs() {
		return this.inTs;
	}

	public void setInTs(Timestamp inTs) {
		this.inTs = inTs;
	}

	public Timestamp getUpdTs() {
		return this.updTs;
	}

	public void setUpdTs(Timestamp updTs) {
		this.updTs = updTs;
	}

	public ListUserDevice getListUserDevice() {
		return this.listUserDevice;
	}

	public void setListUserDevice(ListUserDevice listUserDevice) {
		this.listUserDevice = listUserDevice;
	}

}