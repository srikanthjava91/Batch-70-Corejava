package com.exceptionhandling;

//In Java, try with finally is possible just for closing resources and connections 
//but not for Graceful termination of the code.
//If the code should be graceful termination means, we should use catch block, 
//without catch block we can't except graceful termination if something went wrong in your code.

//After try finally, we cannot use catch block. 
//try-catch-finally order must follow.
//
public class TestExDemo10 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		try {
			System.out.println("in try ");
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("in catch of AE");
		} catch (Exception e) {
			System.out.println("in catch of E");
		}

		finally {
			System.out.println("in finally ");
		}

//		finally {
//		System.out.println("in finally ");
//	}
//
//
		System.out.println("main method ended ");

	}

}
