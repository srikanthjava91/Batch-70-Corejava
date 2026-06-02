package com.exceptionhandling;

public class TestExDemo13 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		System.out.println(add());

		System.out.println("main method ended ");
	}

	static int add() {

		try {
			return 100;

		} catch (Exception e) {
			return 200;
		}

	}
}
