package com.great.entity;

public class Emp_Role {  //用户角色关系表对象
	private String emp_role_id;
	private String emp_id;
	private String role_id;
	
	public Emp_Role() {
		super();
	}
	
	public Emp_Role(String emp_role_id, String emp_id, String role_id) {
		super();
		this.emp_role_id = emp_role_id;
		this.emp_id = emp_id;
		this.role_id = role_id;
	}
	
	public String getEmp_role_id() {
		return emp_role_id;
	}
	public void setEmp_role_id(String emp_role_id) {
		this.emp_role_id = emp_role_id;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	
}
