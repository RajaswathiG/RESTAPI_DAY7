package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="querytable")
public class Carmodel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String carname;
	private String cartype;
	private int owners;
	private String ownername;
	private long mobile;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public int getOwners() {
		return owners;
	}
	public void setOwners(int owners) {
		this.owners = owners;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Carmodel(int id, String carname, String cartype, int owners, String ownername, long mobile, String address) {
		super();
		this.id = id;
		this.carname = carname;
		this.cartype = cartype;
		this.owners = owners;
		this.ownername = ownername;
		this.mobile = mobile;
		this.address = address;
	}
	public Carmodel() {
		super();
		// TODO Auto-generated constructor stub
	}

}