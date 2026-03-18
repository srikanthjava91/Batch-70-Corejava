package com.languagefundamentals.constructors;

public class Employee {

	String eid;
	String ename;
	double salary;

	Employee() {
		System.out.println("no-arg constructor called !!");
		eid = "JFS-101";
		ename = "unknown";
		salary = 50000.00;
	}

//	To avoid ambiguity problems, we must provide same name for constructor parameters and 
//	when we have same name we must need to use this to invoke current class object data members.

	public Employee(String eid, String ename, double salary) {
		System.out.println("parameterized constructor called !!");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Employee e1 = new Employee();
		e1.display();

		Employee e2 = new Employee("JFS-102", "Sanju", 1000000.00);
		e2.display();

		System.out.println("main method started ");
	}

	void display() {
		System.out.println("Emp ID		: " + eid);
		System.out.println("Emp Name	: " + ename);
		System.out.println("Emp Salary	: " + salary);
		System.out.println("*****************************");
	}

}
