package com.logicalstatements01.loops;

import java.util.Scanner;

public class TestLPDemo5 {

	static void findFactors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		findFactors(n);
		sc.close();

	}

}
