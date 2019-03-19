package com.great.entity;

//手机卡号表
public class PhoneCard {

	private String phonecard_id;
	private String phonecard_number;
	private String customer_id;
	private String emp_id;
	private String phonecard_money;
	private String phonecard_area;
	private String phonecard_state;
	private String phonecard_addtime;
	private String receive_time;
	private String sold_time;
	private String package_id;
	
	public PhoneCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PhoneCard(String phonecard_id, String phonecard_number, String customer_id, String emp_id,
			String phonecard_money, String phonecard_area, String phonecard_state, String phonecard_addtime,
			String receive_time, String sold_time, String package_id) {
		super();
		this.phonecard_id = phonecard_id;
		this.phonecard_number = phonecard_number;
		this.customer_id = customer_id;
		this.emp_id = emp_id;
		this.phonecard_money = phonecard_money;
		this.phonecard_area = phonecard_area;
		this.phonecard_state = phonecard_state;
		this.phonecard_addtime = phonecard_addtime;
		this.receive_time = receive_time;
		this.sold_time = sold_time;
		this.package_id = package_id;
	}

	public String getPhonecard_id() {
		return phonecard_id;
	}

	public void setPhonecard_id(String phonecard_id) {
		this.phonecard_id = phonecard_id;
	}

	public String getPhonecard_number() {
		return phonecard_number;
	}

	public void setPhonecard_number(String phonecard_number) {
		this.phonecard_number = phonecard_number;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getPhonecard_money() {
		return phonecard_money;
	}

	public void setPhonecard_money(String phonecard_money) {
		this.phonecard_money = phonecard_money;
	}

	public String getPhonecard_area() {
		return phonecard_area;
	}

	public void setPhonecard_area(String phonecard_area) {
		this.phonecard_area = phonecard_area;
	}

	public String getPhonecard_state() {
		return phonecard_state;
	}

	public void setPhonecard_state(String phonecard_state) {
		this.phonecard_state = phonecard_state;
	}

	public String getPhonecard_addtime() {
		return phonecard_addtime;
	}

	public void setPhonecard_addtime(String phonecard_addtime) {
		this.phonecard_addtime = phonecard_addtime;
	}

	public String getReceive_time() {
		return receive_time;
	}

	public void setReceive_time(String receive_time) {
		this.receive_time = receive_time;
	}

	public String getSold_time() {
		return sold_time;
	}

	public void setSold_time(String sold_time) {
		this.sold_time = sold_time;
	}

	public String getPackage_id() {
		return package_id;
	}

	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}
	
	
}
