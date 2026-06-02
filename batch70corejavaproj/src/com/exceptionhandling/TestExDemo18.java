package com.exceptionhandling;

import java.util.Scanner;

//throw is the keyword for throwing the Exception Explicitly based on your requirement,
//instead of JVM throwing the Exceptions

//throws is the keyword only for satisfying the compiler when we have checked Exceptions. 

//throws vs try catch : throws will not provide graceful termination 
//when there is a problem but if there is a problem in try, 
//catch will execute and the program will be gracefully termination.
public class TestExDemo18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter b number : ");
		int b = sc.nextInt();

		if (b != 0) {
			System.out.println(a / b);
		} else {
			throw new ArithmeticException("Babu chitti dont send zeros ");
		}

	}

}
