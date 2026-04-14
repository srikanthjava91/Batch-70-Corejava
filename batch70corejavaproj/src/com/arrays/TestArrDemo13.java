package com.arrays;

import java.util.Scanner;

//WAP to find prime numbers from a Given array which taken from the console..
public class TestArrDemo13 {

	static boolean isPrime(int a) {
		boolean status = true;

		if (a == 0 || a == 1) {
			status = false;
		}

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				status = false;
				break;
			}
		}

		return status;

	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements to an array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("*****************************");

		for (int a : arr) {
			boolean status = isPrime(a);
			if (status) {
				System.out.print(a + " ");
			}
		}
	}

}
