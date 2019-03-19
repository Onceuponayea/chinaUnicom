package com.great.entity;

public class Netpoint {  //网点表
	private String netpoint_id;
	private String province_name;
	private String city_name;
	private String netpoint_parientid;
	private String netpoint_name;
	private String netpoint_bankcard;
	private String netpoint_phone;
	private String netpoint_address;
	
	public Netpoint() {
		super();
	}
	
	public Netpoint(String netpoint_id, String province_name, String city_name, String netpoint_parientid,
			String netpoint_name, String netpoint_bankcard, String netpoint_phone, String netpoint_address) {
		super();
		this.netpoint_id = netpoint_id;
		this.province_name = province_name;
		this.city_name = city_name;
		this.netpoint_parientid = netpoint_parientid;
		this.netpoint_name = netpoint_name;
		this.netpoint_bankcard = netpoint_bankcard;
		this.netpoint_phone = netpoint_phone;
		this.netpoint_address = netpoint_address;
	}
	public String getNetpoint_id() {
		return netpoint_id;
	}
	public void setNetpoint_id(String netpoint_id) {
		this.netpoint_id = netpoint_id;
	}
	public String getProvince_name() {
		return province_name;
	}
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getNetpoint_parientid() {
		return netpoint_parientid;
	}
	public void setNetpoint_parientid(String netpoint_parientid) {
		this.netpoint_parientid = netpoint_parientid;
	}
	public String getNetpoint_name() {
		return netpoint_name;
	}
	public void setNetpoint_name(String netpoint_name) {
		this.netpoint_name = netpoint_name;
	}
	public String getNetpoint_bankcard() {
		return netpoint_bankcard;
	}
	public void setNetpoint_bankcard(String netpoint_bankcard) {
		this.netpoint_bankcard = netpoint_bankcard;
	}
	public String getNetpoint_phone() {
		return netpoint_phone;
	}
	public void setNetpoint_phone(String netpoint_phone) {
		this.netpoint_phone = netpoint_phone;
	}
	public String getNetpoint_address() {
		return netpoint_address;
	}
	public void setNetpoint_address(String netpoint_address) {
		this.netpoint_address = netpoint_address;
	}
	
	
}
