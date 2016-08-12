package com.smartway.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_itemid database table.
 * 
 */
@Entity
@Table(name="gen_itemid")
@NamedQuery(name="GenItemid.findAll", query="SELECT g FROM GenItemid g")
public class GenItemid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String iotid;

	public GenItemid() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIotid() {
		return this.iotid;
	}

	public void setIotid(String iotid) {
		this.iotid = iotid;
	}

}