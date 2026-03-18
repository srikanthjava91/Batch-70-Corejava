package com.operators;

import java.util.Scanner;

//Ternary Operators -->   
//syntax : 
//condition ? value_if_true : value_if_false

public class TestTernaryOpDemo1 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = 50;

		int max1 = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("max1 value is : " + max1);

		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println("Max values is : " + max);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ? ");

		int age = sc.nextInt();
//		boolean isEligible = (age > 18) ? true : false;
		String isEligible = (age > 18) ? "Yes" : "No";
		System.out.println("The Entered age is Eligible ..? " + isEligible);

	}

}
