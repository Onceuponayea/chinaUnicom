package com.great.entity;

//领卡申请
public class CardApply {
	
	private String cardapply_id;
	private String apply_time;
	private String apply_num;
	private String apply_id;
	private String approve_id;
	private String approve_time;
	private String apply_state;
	public CardApply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardApply(String cardapply_id, String apply_time, String apply_num, String apply_id, String approve_id,
			String approve_time, String apply_state) {
		super();
		this.cardapply_id = cardapply_id;
		this.apply_time = apply_time;
		this.apply_num = apply_num;
		this.apply_id = apply_id;
		this.approve_id = approve_id;
		this.approve_time = approve_time;
		this.apply_state = apply_state;
	}
	public String getCardapply_id() {
		return cardapply_id;
	}
	public void setCardapply_id(String cardapply_id) {
		this.cardapply_id = cardapply_id;
	}
	public String getApply_time() {
		return apply_time;
	}
	public void setApply_time(String apply_time) {
		this.apply_time = apply_time;
	}
	public String getApply_num() {
		return apply_num;
	}
	public void setApply_num(String apply_num) {
		this.apply_num = apply_num;
	}
	public String getApply_id() {
		return apply_id;
	}
	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}
	public String getApprove_id() {
		return approve_id;
	}
	public void setApprove_id(String approve_id) {
		this.approve_id = approve_id;
	}
	public String getApprove_time() {
		return approve_time;
	}
	public void setApprove_time(String approve_time) {
		this.approve_time = approve_time;
	}
	public String getApply_state() {
		return apply_state;
	}
	public void setApply_state(String apply_state) {
		this.apply_state = apply_state;
	}
	
	
	
	
	
	
	

}
