package com.java8features;

//Lambda Expressions vs Inheritance 
@FunctionalInterface
interface In9 {
	void method1();
}

//Invalid '@FunctionalInterface' annotation; 
//In10 is not a functional interface
//@FunctionalInterface
//interface In10 extends In9 {
//	void method2();
//}

public class TestJ8Demo9 {

	public static void main(String[] args) {
		System.out.println("main method started !");
	}
}
