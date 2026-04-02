package com.logicalstatements01.loops;

import java.util.Scanner;

//Q) WAP for Fibonacci series..?
public class TestLPDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values you want to print ..? ");
		int n = sc.nextInt();

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		System.out.print(n1 + " " + n2);// 0 1 1

		for (int i = 0; i < n - 2; i++) {
			n3 = n1 + n2;// 1 + 1= 2
			System.out.print(" " + n3);// 0 1 1 2 3 5
			n1 = n2;// 1 1 2
			n2 = n3;// 1 2 3
		}

		System.out.println("main method ended ");
	}

}
