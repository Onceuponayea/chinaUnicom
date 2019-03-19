package com.great.entity;

public class Log {  //日志表对象
	private String log_id;
	private String log_time;
	private String log_operation;
	private String operation_people;
	private String operation_money;
	private String netpoint_id;
	
	public Log() {
		super();
	}
	
	public Log(String log_id, String log_time, String log_operation, String operation_people, String operation_money,
			String netpoint_id) {
		super();
		this.log_id = log_id;
		this.log_time = log_time;
		this.log_operation = log_operation;
		this.operation_people = operation_people;
		this.operation_money = operation_money;
		this.netpoint_id = netpoint_id;
	}
	
	public String getLog_id() {
		return log_id;
	}
	public void setLog_id(String log_id) {
		this.log_id = log_id;
	}
	public String getLog_time() {
		return log_time;
	}
	public void setLog_time(String log_time) {
		this.log_time = log_time;
	}
	public String getLog_operation() {
		return log_operation;
	}
	public void setLog_operation(String log_operation) {
		this.log_operation = log_operation;
	}
	public String getOperation_people() {
		return operation_people;
	}
	public void setOperation_people(String operation_people) {
		this.operation_people = operation_people;
	}
	public String getOperation_money() {
		return operation_money;
	}
	public void setOperation_money(String operation_money) {
		this.operation_money = operation_money;
	}
	public String getNetpoint_id() {
		return netpoint_id;
	}
	public void setNetpoint_id(String netpoint_id) {
		this.netpoint_id = netpoint_id;
	}
	
	

}
