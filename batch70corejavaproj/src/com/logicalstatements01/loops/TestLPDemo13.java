package com.logicalstatements01.loops;

import java.util.Scanner;

public class TestLPDemo13 {

	static long findFact(long n) {
		if (n == 1) {
			return 1;
		}
		return n * findFact(n - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		long n = sc.nextLong();// 4 3 2 1
		long ft = findFact(n);
		System.out.println("Factorial of a Given number is : " + ft);

	}

}
