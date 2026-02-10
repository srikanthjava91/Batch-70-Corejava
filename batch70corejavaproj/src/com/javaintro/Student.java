package com.javaintro;

public class Student {

	// instance variables --> Heap
	int sid = 0;
	String sname = "unknown";

	// static variables --> Method area
	static int collegeId = 777;
	static String collegeName = "SSS";

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("VCUbe related Information ");

//		Initializing & Accessing the static data directly.
		collegeId = 555;
		collegeName = "Vcube";

		System.out.println("College ID : " + collegeId);// 0 --> 555
		System.out.println("College Name :" + collegeName);// null --> Vcube

//		Initializing & Accessing the instance data.
//		Note : We cannot access instance data in static area directly.
//		If we want to access instance data in static area, we must need to create object.

		System.out.println("************Object1 info ");
		Student s1 = new Student();
		s1.sid = 18;
		s1.sname = "Virat Kohli";
		System.out.println("Student ID   : " + s1.sid);
		System.out.println("Student Name : " + s1.sname);

		System.out.println("************Object2 info ");
		Student s2 = new Student();
		s2.sid = 45;
		s2.sname = "Rohit Sharma";
		System.out.println(collegeId);// 555
		System.out.println(collegeName);// Vcube
		System.out.println(s2.sid);// 0 --> 45
		System.out.println(s2.sname);// null --> Rohit Sharma

		System.out.println("************ Object3 Info ");
		Student s3 = new Student();
		collegeId = 666;
		collegeName = "VSS";
		s3.sid = 7;
		s3.sname = "Dhoni";
		System.out.println("College ID : " + collegeId);// 555
		System.out.println("College Name :" + collegeName);// Vcube
		System.out.println("Student ID   : " + s3.sid);// 0 --> 7
		System.out.println("Student Name : " + s3.sname);// null --> Dhonis

		System.out.println("************ Object4 Info ");
		Student s4 = new Student();
		s4.sid = 1;
		s4.sname = "Rahul";
		System.out.println("College ID : " + collegeId);
		System.out.println("College Name :" + collegeName);
		System.out.println("Student ID   : " + s4.sid);
		System.out.println("Student Name : " + s4.sname);

		System.out.println("************ Object5 Info ");
		Student s5 = new Student();
		s5.sid = 9;
		s5.sname = "Srikanth";
		System.out.println("College ID : " + collegeId);
		System.out.println("College Name :" + collegeName);
		System.out.println("Student ID   : " + s5.sid);
		System.out.println("Student Name : " + s5.sname);

		System.out.println("************ Object6 Info ");
		Student s6 = new Student();
		System.out.println("College ID : " + collegeId);// 666 or 777
		System.out.println("College Name :" + collegeName);// vss or sss
		System.out.println("Student ID   : " + s6.sid);
		System.out.println("Student Name : " + s6.sname);

	}
}
