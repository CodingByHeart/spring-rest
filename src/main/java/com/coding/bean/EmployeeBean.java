package com.coding.bean;

public class EmployeeBean {
	private int id;
	private String name;
	private String moNo;
	private String address;

	public EmployeeBean(int id, String name, String moNo, String address) {
		super();
		this.id = id;
		this.name = name;
		this.moNo = moNo;
		this.address = address;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoNo() {
		return moNo;
	}

	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
