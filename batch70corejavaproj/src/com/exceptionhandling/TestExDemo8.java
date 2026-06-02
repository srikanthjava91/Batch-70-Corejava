package com.exceptionhandling;

public class TestExDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try");
			System.out.println(10 / 0);// AE
			System.out.println(10.5 / 0);// Infinity
			System.out.println(10.5 / 0.0);/// Infinity
			System.out.println(0.0 / 0.0);// NaN
			System.out.println(0 / 0.0);// NaN

		} catch (Exception e) {
			System.err.println("in catch ");
			System.err.println(e.getMessage());// Description only
			System.err.println(e.toString());// Name +Description only
			System.out.println(e);// Name +Description only

		}

	}
}
