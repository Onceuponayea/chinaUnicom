package com.great.entity;

public class Emp {   //员工表对象
	private String emp_id;
	private String job_num;
	private String emp_name;
	private String emp_pwd;
	private String pay_pwd;
	private String emp_phone;
	private String emp_sex;
	private String entry_time;
	private String emp_stateid;
	private String netpoint_id;
	private String rowno;
	
	public Emp() {
		super();
	}

	public Emp(String emp_id, String job_num, String emp_name, String emp_pwd, String pay_pwd, String emp_phone,
			String emp_sex, String entry_time, String emp_stateid, String netpoint_id, String rowno) {
		super();
		this.emp_id = emp_id;
		this.job_num = job_num;
		this.emp_name = emp_name;
		this.emp_pwd = emp_pwd;
		this.pay_pwd = pay_pwd;
		this.emp_phone = emp_phone;
		this.emp_sex = emp_sex;
		this.entry_time = entry_time;
		this.emp_stateid = emp_stateid;
		this.netpoint_id = netpoint_id;
		this.rowno = rowno;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getJob_num() {
		return job_num;
	}

	public void setJob_num(String job_num) {
		this.job_num = job_num;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_pwd() {
		return emp_pwd;
	}

	public void setEmp_pwd(String emp_pwd) {
		this.emp_pwd = emp_pwd;
	}

	public String getPay_pwd() {
		return pay_pwd;
	}

	public void setPay_pwd(String pay_pwd) {
		this.pay_pwd = pay_pwd;
	}

	public String getEmp_phone() {
		return emp_phone;
	}

	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}

	public String getEmp_sex() {
		return emp_sex;
	}

	public void setEmp_sex(String emp_sex) {
		this.emp_sex = emp_sex;
	}

	public String getEntry_time() {
		return entry_time;
	}

	public void setEntry_time(String entry_time) {
		this.entry_time = entry_time;
	}

	public String getEmp_stateid() {
		return emp_stateid;
	}

	public void setEmp_stateid(String emp_stateid) {
		this.emp_stateid = emp_stateid;
	}

	public String getNetpoint_id() {
		return netpoint_id;
	}

	public void setNetpoint_id(String netpoint_id) {
		this.netpoint_id = netpoint_id;
	}

	public String getRowno() {
		return rowno;
	}

	public void setRowno(String rowno) {
		this.rowno = rowno;
	}
	
	
	
}
