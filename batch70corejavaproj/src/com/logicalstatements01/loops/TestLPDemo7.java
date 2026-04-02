package com.logicalstatements01.loops;

import java.util.Scanner;

//Q) WAP to check the Given number is Perfect or not ..?
public class TestLPDemo7 {

	static boolean isPerfect(int n) {
		boolean flag = false;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;// 6
			}
		}

		if (sum == n) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {
		System.out.println("main method strated !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		boolean status = isPerfect(num);

		if (status) {
			System.out.println("The Given number is Perfect !!");
		} else {
			System.out.println("The Given number is not a Perfect !!");
		}

		System.out.println("main method ended !!");

	}

}
