package com.logicalstatements01.loops;

//Q) WAP to print prime numbers up to 100 numbers..? 
public class TestLPDemo10 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			status = false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method strated");

		for (int i = 0; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");// 2 3
			}
		}
		System.out.println();
		System.out.println("main method ended");
	}

}
