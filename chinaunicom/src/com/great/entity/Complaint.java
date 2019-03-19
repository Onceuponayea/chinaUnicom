package com.great.entity;

//投诉建议表
public class Complaint {
	
	private String complaint_id;
	private String complaint_people;
	private String complaints;
	private String netpoint_id;
	private String complaint_time;
	private String complaint_state;
	private String complaint_phone;
	private String complaint_manage;
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(String complaint_id, String complaint_people, String complaints, String netpoint_id,
			String complaint_time, String complaint_state, String complaint_phone, String complaint_manage) {
		super();
		this.complaint_id = complaint_id;
		this.complaint_people = complaint_people;
		this.complaints = complaints;
		this.netpoint_id = netpoint_id;
		this.complaint_time = complaint_time;
		this.complaint_state = complaint_state;
		this.complaint_phone = complaint_phone;
		this.complaint_manage = complaint_manage;
	}
	public String getComplaint_id() {
		return complaint_id;
	}
	public void setComplaint_id(String complaint_id) {
		this.complaint_id = complaint_id;
	}
	public String getComplaint_people() {
		return complaint_people;
	}
	public void setComplaint_people(String complaint_people) {
		this.complaint_people = complaint_people;
	}
	public String getComplaints() {
		return complaints;
	}
	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}
	public String getNetpoint_id() {
		return netpoint_id;
	}
	public void setNetpoint_id(String netpoint_id) {
		this.netpoint_id = netpoint_id;
	}
	public String getComplaint_time() {
		return complaint_time;
	}
	public void setComplaint_time(String complaint_time) {
		this.complaint_time = complaint_time;
	}
	public String getComplaint_state() {
		return complaint_state;
	}
	public void setComplaint_state(String complaint_state) {
		this.complaint_state = complaint_state;
	}
	public String getComplaint_phone() {
		return complaint_phone;
	}
	public void setComplaint_phone(String complaint_phone) {
		this.complaint_phone = complaint_phone;
	}
	public String getComplaint_manage() {
		return complaint_manage;
	}
	public void setComplaint_manage(String complaint_manage) {
		this.complaint_manage = complaint_manage;
	}
	
}
