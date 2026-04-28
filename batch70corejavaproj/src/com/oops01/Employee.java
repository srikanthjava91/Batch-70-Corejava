package com.oops01;

public class Employee {

	private String eid;
	private String ename;

	public Employee(String eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = "JFS-B71-" + eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
