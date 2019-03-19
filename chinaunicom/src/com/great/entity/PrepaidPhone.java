package com.great.entity;

//电子话费充值卡
public class PrepaidPhone {

	private String prepaidphone_id;
	private String prepaidphone_number;
	private String prepaidphone_pwd;
	private String prepaidphone_money;
	private String prepaidphone_state;
	private String emp_id;
	private String prepaidphone_time;
	
	public PrepaidPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrepaidPhone(String prepaidphone_id, String prepaidphone_number, String prepaidphone_pwd,
			String prepaidphone_money, String prepaidphone_state, String emp_id, String prepaidphone_time) {
		super();
		this.prepaidphone_id = prepaidphone_id;
		this.prepaidphone_number = prepaidphone_number;
		this.prepaidphone_pwd = prepaidphone_pwd;
		this.prepaidphone_money = prepaidphone_money;
		this.prepaidphone_state = prepaidphone_state;
		this.emp_id = emp_id;
		this.prepaidphone_time = prepaidphone_time;
	}

	public String getPrepaidphone_id() {
		return prepaidphone_id;
	}

	public void setPrepaidphone_id(String prepaidphone_id) {
		this.prepaidphone_id = prepaidphone_id;
	}

	public String getPrepaidphone_number() {
		return prepaidphone_number;
	}

	public void setPrepaidphone_number(String prepaidphone_number) {
		this.prepaidphone_number = prepaidphone_number;
	}

	public String getPrepaidphone_pwd() {
		return prepaidphone_pwd;
	}

	public void setPrepaidphone_pwd(String prepaidphone_pwd) {
		this.prepaidphone_pwd = prepaidphone_pwd;
	}

	public String getPrepaidphone_money() {
		return prepaidphone_money;
	}

	public void setPrepaidphone_money(String prepaidphone_money) {
		this.prepaidphone_money = prepaidphone_money;
	}

	public String getPrepaidphone_state() {
		return prepaidphone_state;
	}

	public void setPrepaidphone_state(String prepaidphone_state) {
		this.prepaidphone_state = prepaidphone_state;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getPrepaidphone_time() {
		return prepaidphone_time;
	}

	public void setPrepaidphone_time(String prepaidphone_time) {
		this.prepaidphone_time = prepaidphone_time;
	}
	
	
}
