package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int a = sc.nextInt();// 10

		System.out.println("Enter b number ");
		int b = sc.nextInt();// 5

		try {
			System.out.println("in try ");
			System.out.println(a / b);
//			No exception of type Object can be thrown; 
//			an exception type must be a subclass of Throwable
		} catch (ArithmeticException ex) {
			System.err.println("in Catch ");
			System.err.println("We should not enter zero's");
			ex.printStackTrace();
		}

		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");

	}

}
