package com.lxit.loans.model;

public class ApplyLoans {
	private int id;  //贷款申请表id
	private int userId;  //贷款申请人
	private String type;  //贷款类型
	private double money;  //贷款金额
	private int deadline;  //贷款期限
	private double rate;   //贷款利息
	private String purpose;  //贷款用途
	private String describe;  //贷款描述
	private String way;  //还款方式
	private String time;  //贷款时间
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getDeadline() {
		return deadline;
	}
	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Applyloans [id=" + id + ", userId=" + userId + ", type=" + type + ", money=" + money + ", deadline="
				+ deadline + ", rate=" + rate + ", purpose=" + purpose + ", describe=" + describe + ", way=" + way
				+ ", time=" + time + "]";
	}
	
}
