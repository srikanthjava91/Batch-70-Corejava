package com.exceptionhandling;

public class TestExDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String s = "Srikanth";// 8
		System.out.println(s.length());

		String s1 = "";// 0
		System.out.println(s1.length());

		String s2 = "null";// 4
		System.out.println(s2.length());

		try {
			System.out.println("in try");
			String s3 = null;// null dot anything is called NPE
			System.out.println(s3.length());// NPE
		} catch (NullPointerException e) {
			System.out.println("in catch");
			e.printStackTrace();
		}

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

	}

}
