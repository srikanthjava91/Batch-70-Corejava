package com.operators;

//Assignment Operators or Compound Operators are 
//= += -= *= /= %=
public class TestAssignmentOperators {

	public static void main(String[] args) {

		int result = 0;
		double a = 5.5;
//		result = result + a;//Type mismatch: cannot convert from double to int

		result += a;// result = result + a
		System.out.println("addition : " + result);// 5
		System.out.println("*****************");

		double b = 2.9;
//		result = (int) (result - b);// Type mismatch: cannot convert from double to int
		result -= b;
		System.out.println("Subtraction : " + result);

		double c = 4.7;
//		result = result * c;
		result *= c;
		System.out.println("multiplication : " + result);// 9

		double d = 3;
		result /= d;// result = result/3;
		System.out.println("Division or Quotient : " + result);// 3

		double e = 1;
		result %= e;// result = result%e;--> result = 3/1= 0
		System.out.println("Modulus or Reminder  : " + result);

	}

}
