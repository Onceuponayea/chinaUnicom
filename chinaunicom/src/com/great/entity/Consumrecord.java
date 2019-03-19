package com.great.entity;

//消费记录表
public class Consumrecord {
	
	private String consum_id;
	private String mainphone_number;
	private String sidephone_number;
	private String consum_time;
	private String operation_name;
	private String consum_flow;
	private String consum_money;
	private String pay_mode;
	private String operation_people;
	public Consumrecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consumrecord(String consum_id, String mainphone_number, String sidephone_number, String consum_time,
			String operation_name, String consum_flow, String consum_money, String pay_mode, String operation_people) {
		super();
		this.consum_id = consum_id;
		this.mainphone_number = mainphone_number;
		this.sidephone_number = sidephone_number;
		this.consum_time = consum_time;
		this.operation_name = operation_name;
		this.consum_flow = consum_flow;
		this.consum_money = consum_money;
		this.pay_mode = pay_mode;
		this.operation_people = operation_people;
	}
	public String getConsum_id() {
		return consum_id;
	}
	public void setConsum_id(String consum_id) {
		this.consum_id = consum_id;
	}
	public String getMainphone_number() {
		return mainphone_number;
	}
	public void setMainphone_number(String mainphone_number) {
		this.mainphone_number = mainphone_number;
	}
	public String getSidephone_number() {
		return sidephone_number;
	}
	public void setSidephone_number(String sidephone_number) {
		this.sidephone_number = sidephone_number;
	}
	public String getConsum_time() {
		return consum_time;
	}
	public void setConsum_time(String consum_time) {
		this.consum_time = consum_time;
	}
	public String getOperation_name() {
		return operation_name;
	}
	public void setOperation_name(String operation_name) {
		this.operation_name = operation_name;
	}
	public String getConsum_flow() {
		return consum_flow;
	}
	public void setConsum_flow(String consum_flow) {
		this.consum_flow = consum_flow;
	}
	public String getConsum_money() {
		return consum_money;
	}
	public void setConsum_money(String consum_money) {
		this.consum_money = consum_money;
	}
	public String getPay_mode() {
		return pay_mode;
	}
	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}
	public String getOperation_people() {
		return operation_people;
	}
	public void setOperation_people(String operation_people) {
		this.operation_people = operation_people;
	}
	

}
