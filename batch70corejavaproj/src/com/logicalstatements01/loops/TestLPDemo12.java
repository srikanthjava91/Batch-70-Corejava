package com.logicalstatements01.loops;

import java.util.Scanner;

//WAP to find factorial of a Given number using for loop ..?
//input is : 4 
//output is : 4! = 4*3*2*1 
public class TestLPDemo12 {

	static int findFact(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();// 4 3 2 1
		int ft = findFact(n);
		System.out.println("Factorial of a Given number is : " + ft);

	}

}
