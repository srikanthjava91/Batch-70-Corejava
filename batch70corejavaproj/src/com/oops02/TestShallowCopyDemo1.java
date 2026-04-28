package com.oops02;

class Student implements Cloneable {
	int sid;
	String sname;

	Address address;

	public Student(int sid, String sname, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

}

public class TestShallowCopyDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method strated ");
		Address address = new Address("Hyderabad");
		Student s1 = new Student(101, "Aakash", address);

		Student s2 = (Student) s1.clone();

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println(s1);
		System.out.println("**********************");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("--------------------------------------");
		s2.sid = 103;
		System.out.println(s1.sid);// 101
		System.out.println(s2.sid);// 103
		System.out.println("-------------------------------------");
		s2.address.city = "Banglore";
		System.out.println(s1.address.city);// Banglore
		System.out.println(s2.address.city);// Banglore

		System.out.println(s2);
	}

}
