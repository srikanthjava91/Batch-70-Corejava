package com.oops02;

class Student1 {

	int age;
	String sname;
	Address1 add1;

	public Student1(int age, String sname, Address1 add1) {
		super();
		this.age = age;
		this.sname = sname;
		this.add1 = add1;
	}

	public Student1(Student1 student1) {
		this.age = student1.age;
		this.sname = student1.sname;
		this.add1 = new Address1(student1.add1);
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

	public Address1(Address1 add1) {
		this.city = add1.city;
	}

}

public class TestDeepCopyDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Address1 add1 = new Address1("Hyderabad");
		Student1 s1 = new Student1(22, "Suresh", add1);

		System.out.println(s1.age);
		System.out.println(s1.sname);
		System.out.println(s1.add1.city);
		System.out.println("*****************************");

		Student1 s2 = new Student1(s1);
		System.out.println(s2.age);
		System.out.println(s2.sname);
		System.out.println(s2.add1.city);

		System.out.println("---------------------");
		s2.add1.city = "Banglore";

		System.out.println(s1.add1.city);// Hyderabad
		System.out.println(s2.add1.city);// Banglore

	}

}
