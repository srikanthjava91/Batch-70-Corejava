package com.java8features;

//Note : If we have two abstract methods in interface  then, 
//Invalid '@FunctionalInterface' annotation; 
//In1 is not a functional interface

//Note : Lambda Expression works with only Functional interfaces but not in all the places.
//So If you want to work with Lambda Expression, we must need to have Functional interface.
//Lambda Expressions introduced to achieve concise coding or smart coding. 

//@FunctionalInterface: FI means, which contains only one Abstract method

@FunctionalInterface
interface In1 {
	void method1();
}

public class TestJ8Demo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		In1 i = () -> System.out.println("method1 called ");

		i.method1();

		System.out.println("main method ended ");
	}

}
