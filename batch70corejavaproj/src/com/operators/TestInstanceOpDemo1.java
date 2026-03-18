package com.operators;

public class TestInstanceOpDemo1 {

	public static void main(String[] args) {

		Integer i1 = 10;

		System.out.println(i1 instanceof Integer);// true
		System.out.println(i1 instanceof Number);// true
		System.out.println(i1 instanceof Object);// true

		String s1 = "Srikanth";
		// Incompatible conditional operand types String and Integer
//		System.out.println(s1 instanceof Integer);//CE

		Number n = 2147483647;
		System.out.println(n instanceof Number);// true
		System.out.println(n instanceof Integer);// true

		Number n1 = null;
		System.out.println(n1 instanceof Number);// false
		System.out.println(n1 instanceof Integer);// false

	}

}
