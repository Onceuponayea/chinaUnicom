package com.great.entity;

//角色菜单关系表
public class Role_Menu {

	private String role_menuid;
	private String role_id;
	private String menu_id;
	
	public Role_Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role_Menu(String role_menuid, String role_id, String menu_id) {
		super();
		this.role_menuid = role_menuid;
		this.role_id = role_id;
		this.menu_id = menu_id;
	}

	public String getRole_menuid() {
		return role_menuid;
	}

	public void setRole_menuid(String role_menuid) {
		this.role_menuid = role_menuid;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	
	
}
