package com.operators;

//== vs equals method 
//Comparison Operators : == < <= > >= != 
//All Comparison Operators will give the result of boolean values like true or false.
//Whenever we have primitive data types, 
//== operator checks the content, if the content is same it will return true.

//Whenever we are working with Object Data types, 
//== Operators not checks the content and it checks the addresses of the Object.
public class TestComparisonOpDemo1 {

	public static void main(String[] args) {

		Integer i1 = 127;
		Integer i2 = 127;

		Integer i3 = 200;
		Integer i4 = 200;

		System.out.println(i1 == i2);// true
		System.out.println(i3 == i4);// false

		System.out.println("*****************************");
//		String Literals are storing into String Constant Pool 
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);// true

//		String Object with new keyword 
		String s3 = new String("Srikanth");
		String s4 = new String("Srikanth");
		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));

		System.out.println("*****************************");
		int i = 10;
		int j = 10;

		System.out.println(i == j);// true

		float f1 = 10.5F;
		double f2 = 10.5;

		System.out.println(f1 == f2);// true

		char c = 'A';
		char c1 = (char) 65;
		System.out.println(c == c1);

	}

}
