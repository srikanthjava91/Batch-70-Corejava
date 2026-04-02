package com.logicalstatements01.loops;

import java.util.Scanner;

//A prime number is a natural number greater than 1 that has exactly two positive divisors: 1 and itself.
//A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers. 
//For example, 5 is prime because its only divisors are 1 and 5, whereas 6 is not prime because it has divisors 1, 2, 3, and 6. 
//The number 1 is neither prime nor composite, making it unique. The smallest and only even prime number is 2; all other primes are odd.

public class TestLPDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int n = sc.nextInt();
		boolean status = true;

		if (n == 0 || n == 1) {
			status = false;
		}

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				status = false;
				break;
			}

		}

		if (status) {
			System.out.println("The given number is Prime !");
		} else {
			System.out.println("The given number is not aPrime !");
		}

		System.out.println("main method started !!");

	}

}
