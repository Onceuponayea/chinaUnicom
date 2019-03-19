package com.great.entity;

//套餐
public class Package {

	private String package_id;
	private String package_name;
	private String package_money;
	
	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Package(String package_id, String package_name, String package_money) {
		super();
		this.package_id = package_id;
		this.package_name = package_name;
		this.package_money = package_money;
	}

	public String getPackage_id() {
		return package_id;
	}

	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	public String getPackage_money() {
		return package_money;
	}

	public void setPackage_money(String package_money) {
		this.package_money = package_money;
	}
	
	
}
