package com.languagefundamentals.methods;

//with argument + no return type 
public class TestMethodsDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		// Call by value
		greet("good morning ", 10);
		addition(100, 200);
		subtraction(400, 600);

	}

	static void greet(String wish, int time) {
		System.out.println("Greeting : " + wish);
		System.out.println("Time is : " + time);
	}

	static void addition(int a, int b) {
		System.out.println("In addition");
		System.out.println(a + b);
	}

	static void subtraction(float f, double d) {
		System.out.println("In sibtraction ");
		System.out.println(d - f);
	}

}
