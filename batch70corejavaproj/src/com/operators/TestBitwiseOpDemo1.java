package com.operators;

//6) Bitwise Operators --> | & ^ ~
public class TestBitwiseOpDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		int a = 10;
		int b = 20;
		int c = 10;

		//// 1 & 1 --> 1
		/// 1 & 0 --> 0
		System.out.println(true & true);// true
		System.out.println(true & false);// false
		System.out.println(false & true);// false
		System.out.println(false & false);// false

		System.out.println(a == c & a != b);// true

		System.out.println(72 & 10);
		System.out.println(36 & 4);// 4
		System.out.println(65 & 6);// 0
		System.out.println(24 & 3);// 0

		System.out.println("***********************");
		System.out.println(72 | 10);// 74
		System.out.println(36 | 4);// 36
		System.out.println(65 | 6);// 71
		System.out.println(24 | 3);// 27
		System.out.println("***************************");
		System.out.println(true | true);// true
		System.out.println(true | false);// true
		System.out.println(false | true);// true
		System.out.println(false | false);// false

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(true ^ true);// false
		System.out.println(true ^ false);// true
		System.out.println(false ^ true);// true
		System.out.println(false ^ false);// false

		System.out.println(72 ^ 10);// 66
		System.out.println(36 ^ 4);// 36
		System.out.println(65 ^ 6);// 71
		System.out.println(24 ^ 3);// 27

		System.out.println(~10); // (~10)= -(10+1)
		System.out.println(~65);

	}

}
