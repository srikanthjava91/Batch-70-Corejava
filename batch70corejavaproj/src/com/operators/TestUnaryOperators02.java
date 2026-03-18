package com.operators;

public class TestUnaryOperators02 {

	public static void main(String[] args) {

		int a = 5;
		int b = 4;

		System.out.println(b++);// 4 --> 5
		System.out.println(++a);// 6
		System.out.println(b--);// 5 --> 4
		System.out.println(--b);// 3
		System.out.println(a--);// 6 --> 5
		System.out.println(b++);// 3--> 4
		System.out.println(++b);// 5
		System.out.println(--a);// 4
		System.out.println(a - b);// -1
		System.out.println(a++);// 4 --> 5
		System.out.println(--b);// 4

		System.out.println("a vaalue is : " + a);// 5
		System.out.println("b vaalue is : " + b);// 4

		// 5 + 4 =9 --> 7 + 6 = 13
		System.out.println(a++ + b++ + ++a + ++b);// 22 20 24 25

		// 7 + 7 = 14 - 9 = 5+ 6 = 11
		System.out.println((a++ + ++b) - (++a + --b));// 0 7 10 11
		System.out.println(a++ + ++b - ++a + --b);// 0 7 10 11

	}

}
