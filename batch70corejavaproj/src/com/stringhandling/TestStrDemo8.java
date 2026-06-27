package com.stringhandling;

//A-Z : 65-90 
//a-z : 97-122
public class TestStrDemo8 {

	public static void main(String[] args) {

		String s1 = "Abhi";
		String s2 = "Abhi";
//		Compares two strings lexicographically.
		System.out.println(s1.compareTo(s2));

//		107
		String s3 = "Srikanth";
//		110
		String s4 = "Srinivas";
		System.out.println(s3.compareTo(s4));

		// 74
		// 106
		String s5 = "Java";
		String s6 = "java";
		System.out.println(s5.compareTo(s6));
		System.out.println(s5.compareToIgnoreCase(s6));

		String s7 = "abc";
		String s8 = "Abc";
		System.out.println(s7.compareTo(s8));

		String s9 = "";
		String s10 = "Java";
		System.out.println(s10.compareTo(s9));
		System.out.println(s9.concat(s10));
		System.out.println("Srikanth" + "Java" + 10 + 5.9 );
		
		
		String s11 = "Spring";
		System.out.println(s11.contentEquals("Spring"));
		
		String s12 = "Spring";
		System.out.println(s11.equals(s12));
		System.out.println(s11.equalsIgnoreCase("SpRING"));//true
		System.out.println(s11.contentEquals(s12));
		

	}

}
