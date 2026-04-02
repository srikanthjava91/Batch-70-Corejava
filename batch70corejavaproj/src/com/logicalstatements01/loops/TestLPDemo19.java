package com.logicalstatements01.loops;

import java.util.Scanner;

public class TestLPDemo19 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 153
		int n1 = n;
		int temp = n;

		System.out.println("***********");

		int sum = 0;
		int r = 0;

		String s = Integer.toString(n);// 153 --> "153"
		int count = s.length(); // 3

		while (n1 > 0) {
			r = n1 % 10;// 3 5 1
			n1 = n1 / 10;// 15 5 1
//			sum = sum + r * r * r;
			sum = (int) (sum + Math.pow(r, count));
		}

		if (sum == temp) {
			System.out.println("The Given number is Armstrong number : ");
		} else {
			System.out.println("The Given number is not a Armstrong number : ");
		}

	}

}
