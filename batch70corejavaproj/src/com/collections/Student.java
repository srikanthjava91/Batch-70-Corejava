package com.collections;

public class Student {

	// private variables
	private int sid;
	private String sname;
	private int age;
	private long phone;

	@Override
	public String toString() {
		return "Student info : [SID : "+ sid + 
				", Student name : " + sname +
				", Student Age  :" + age +
				", Phone number: " + phone + "]";
	}

	// all arg Constructor
	public Student(int sid, String sname, int age, long phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.phone = phone;
	}

	// No Arg constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// public Setter & getter methods
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
