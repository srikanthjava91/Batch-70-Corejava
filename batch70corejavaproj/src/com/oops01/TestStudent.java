package com.oops01;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setSid(18);
		s1.setSname("Virat");
		s1.setPhone(9181818181L);
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getPhone());

//		s1.sid = 18;
//		s1.sname = "Kohli";
//		s1.phone = 9181818181L;

//		Accessing the data from outside of the classes directly.
//		System.out.println("Student ID : " + s1.sid);
//		System.out.println("Stident Name: " + s1.sname);
//		System.out.println("Student Phone : " + s1.phone);

	}
}
