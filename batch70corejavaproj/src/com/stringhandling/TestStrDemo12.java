package com.stringhandling;

public class TestStrDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String str = "Java is simple";
		char[] ch = new char[10];
		str.getChars(8, 14, ch, 0);

		for (char c : ch) {
			System.out.print(c + " ");
		}
	}

}
