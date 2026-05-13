package com.oops03;

public class TestDemo1 {

	static String welcome() {
		return "Good Morning";
	}

	static String welcome(String str) {
		return str;
	}

	// Duplicate method welcome() in type TestDemo1
//	Object welcome(){
//		return "Good evening";
//	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(welcome());
		System.out.println(welcome("Good evening "));
	}

}
