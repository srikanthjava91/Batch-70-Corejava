package com.exceptionhandling;

public class TestExDemo7 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		try {
			System.out.println("In try ");
			System.out.println(10 / 2);
			String str = null;
			System.out.println(str.length());
		} catch (  NullPointerException | ArithmeticException  e) {
			System.err.println("in catch" + e.getMessage());
			System.err.println("in catch" + e.toString());
			System.out.println(e);
		}

		System.out.println("main method ended ");

	}

}
