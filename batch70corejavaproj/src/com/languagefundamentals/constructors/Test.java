package com.languagefundamentals.constructors;

class Student1 {

	int id;
	String name;
	String city;

	Student1() {
		this(101); // calls constructor with 1 parameter
		System.out.println("Default Constructor");
	}

	Student1(int id) {
		this(101, "Srikanth"); // calls constructor with 2 parameters
		System.out.println("One Parameter Constructor");
	}

	Student1(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two Parameter Constructor");
	}

	void show() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println("main method started ");
		Student1 s = new Student1();
		s.show();
	}

}
