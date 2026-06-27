package com.stringhandling;

public class TestStrDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String s1 = "";
		String s2 = new String();
		String s3 = null;
		String s4 = " ";

		System.out.println(s1.isEmpty());// true --> Returns true if, and only if, length() is 0.
		System.out.println(s1.isBlank());// true --> Returns true if the string is empty or contains only white space
											// codepoints, otherwise false.

		System.out.println(s2.isEmpty());//
		System.out.println(s2.isBlank());//

//		System.out.println(s3.isEmpty());//NPE 
//		System.out.println(s3.isBlank());//NPE

		System.out.println(s4.isEmpty());// false
		System.out.println(s4.isBlank());// true

	}

}
