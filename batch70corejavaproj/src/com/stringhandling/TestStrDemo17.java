package com.stringhandling;

public class TestStrDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		All leading and trailing space removed, 
		String str = "    Java        is simple          ";
		System.out.println(str);
		str = str.trim();
		System.out.println(str);

		str = str.replaceAll("\\s", "");
		System.out.println(str);

//		beginIndex the beginning index, inclusive.
//		endIndex the ending index, exclusive.
		String str1 = "Hyderabad";
		System.out.println(str1.substring(0, 3));// Hyd
		System.out.println(str1.subSequence(0, 3));// Hyd

		int i = 100;
		char c = 'A';
		double sal = 500000.00;
		String str2 = "Srikanth";

		// Any data type to convert into String will use valueOf method
		String i1 = String.valueOf(i);
		String sal1 = String.valueOf(sal);

		System.out.println(100 + i);// 200
		System.out.println(100 + i1);// 1001001
		System.out.println(100000.00 + sal1);

		String i2 = "100";
		System.out.println(100 + i2);// 100100

//		String to int conversion 
		int i3 = Integer.parseInt(i2);
		System.out.println(100 + i3);

//		String to long conversion 
		String ph = "9972677655";
		long phl = Long.parseLong(ph);
		System.out.println(phl);

	}

}
