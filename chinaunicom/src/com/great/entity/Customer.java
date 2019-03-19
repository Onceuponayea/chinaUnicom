package com.great.entity;

//客户
public class Customer {
	
	private String customer_id;
	private String customer_name;
	private String customer_idnumber;
	private String customer_address;
	private String customer_sex;
	private String customer_age;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customer_id, String customer_name, String customer_idnumber, String customer_address,
			String customer_sex, String customer_age) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_idnumber = customer_idnumber;
		this.customer_address = customer_address;
		this.customer_sex = customer_sex;
		this.customer_age = customer_age;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_idnumber() {
		return customer_idnumber;
	}
	public void setCustomer_idnumber(String customer_idnumber) {
		this.customer_idnumber = customer_idnumber;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getCustomer_sex() {
		return customer_sex;
	}
	public void setCustomer_sex(String customer_sex) {
		this.customer_sex = customer_sex;
	}
	public String getCustomer_age() {
		return customer_age;
	}
	public void setCustomer_age(String customer_age) {
		this.customer_age = customer_age;
	}
	

}
