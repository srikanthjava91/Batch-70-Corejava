package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {

		System.out.println("main method started");

		try {
			System.out.println("in try");
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("in catch ");
		}

		System.out.println("main method ended");
	}

}
