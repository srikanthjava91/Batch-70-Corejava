package com.oops01;

//DTO  : Data Transfer Object 
//POJO : Plain Old Java Object  
//Model Object : Same like your Database table

public class Student {

	private int sid;
	private String sname;
	private long phone;

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getPhone() {
		return phone;
	}

}
