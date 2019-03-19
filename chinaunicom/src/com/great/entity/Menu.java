package com.great.entity;

public class Menu { //菜单表
	private String menu_id;
	private String menuname;
	private String menuurl;
	private String parentid;
	
	public Menu() {
		super();
	}
	
	public Menu(String menu_id, String menuname, String menuurl, String parentid) {
		super();
		this.menu_id = menu_id;
		this.menuname = menuname;
		this.menuurl = menuurl;
		this.parentid = parentid;
	}
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenuurl() {
		return menuurl;
	}
	public void setMenuurl(String menuurl) {
		this.menuurl = menuurl;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	
	
}
