package com.oops.abstraction;

public interface Animal {

	public static final String ORGANISANTION_NAME = "VCUBE";

	public abstract void sound();

	public abstract void walk();

	public abstract void sleep();

	public abstract void eat();

	public void run();

//	default methods introduced from java8 to avoid "Backward compatibility problems".
//	Yes, We can override default methods in classes, with out default keyword. 
//	by default methods, we can achieve default behavior for the classes.

	public default void hunt() {
		System.out.println("By default every animal can hunt something !");
		welcome();
	}

	public default void drink() {
		System.out.println("Every animal drinks water Regularly !!");
		welcome();
	}

//	static methods introduced from java8 to avoid "Backward compatibility problems".
//	But, We cannot override static methods in classes.
//	static methods are introducing to provide utility behavior or constant behavior.
//	(which we cannot change later or override the functionalities )
	public static void breath() {
		System.out.println("Ofcourse Every animal Breaths to survive !!");
	}

	public static void hello() {
		System.out.println("Good afternoon ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated !");
		hello();
	}

//	private method are helping in interfaces to avoid duplicate code from default methods.
	private static void welcome() {
		System.out.println("Welcome to Vcube");
		System.out.println("Welcome to Vcube");
		System.out.println("Welcome to Vcube");
		System.out.println("Welcome to Vcube");
		System.out.println("Welcome to Vcube");
		System.out.println("Welcome to Vcube");

	}

}
