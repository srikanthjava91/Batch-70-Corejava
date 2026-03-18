package com.languagefundamentals.constructors;

//Super or Parent 
public class Person {

	String name;
	int age;
	long phone;

	public Person() {
		System.out.println("person no-arg constructor called !!");
	}

	Person(String name, int age, long phone) {
		System.out.println("Person 3 argumented constructor called !");
		this.name = name;
		this.age = age;
		this.phone = phone;

	}

	public static void main(String[] args) {
		System.out.println("main method started from Person!!");
	}

}

//Sub class or Child class 
class Customer extends Person {

	public Customer() {
		System.out.println("Customer no-arg constructor called !!");
	}

	Customer(String name, int age, long phone) {
		super(name, age, phone);
		System.out.println("Customer 3 argumented constructor called !");

	}

	public static void main(String[] args) {
		System.out.println("main method started from Customer!!");

//		Customer c1 = new Customer();
//		c1.show();

		Customer c2 = new Customer("Manu", 22, 9988776655L);
		c2.show();

		System.out.println("main method ended from Customer!!");

	}

	void show() {
		System.out.println("**************Customer Info ****************");
		System.out.println("Name of the Customer : " + name);
		System.out.println("Age of the Customer : " + age);
		System.out.println("Contact of the Customer : " + phone);
		System.out.println("**************************************************");
	}
}
