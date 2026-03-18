package com.operators;

import java.util.Scanner;

//Arithmetic Operators : + - * / % 
//WAP to calculate the values which received from console 
public class TestArithmeticOperators {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();// 10

		System.out.println("Enter b number : ");
		int b = sc.nextInt();// 5

		// String + anything is String only
//		System.out.println("Addition : " + a + b);//10050 

//		BODMAS 
		System.out.println("Addition : " + (a + b));// 150

		// The operator - is undefined for the argument type(s) String, int
//		System.out.println("subtraction :" + a - b );//CE 
		System.out.println("subtraction :" + (a - b));// CE

		System.out.println("Multiplication : " + a * b);// 50
		System.out.println("Division : " + a / b);// --> Quotient --> 98/10--> 9
		System.out.println("Modulus : " + a % b);// --> Reminder --> 98/10 --> 8
	}

}
