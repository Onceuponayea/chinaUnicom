package com.great.entity;

//数据字典
public class DataDictionary {
	
	private String data_id;
	private String data_name;
	private String parent_id;
	
	public DataDictionary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DataDictionary(String data_id, String data_name, String parent_id) {
		super();
		this.data_id = data_id;
		this.data_name = data_name;
		this.parent_id = parent_id;
	}
	
	public String getData_id() {
		return data_id;
	}
	public void setData_id(String data_id) {
		this.data_id = data_id;
	}
	
	public String getData_name() {
		return data_name;
	}
	public void setData_name(String data_name) {
		this.data_name = data_name;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	

}
