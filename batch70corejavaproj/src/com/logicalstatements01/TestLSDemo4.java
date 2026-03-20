package com.logicalstatements01;

import java.util.Scanner;

//WAP to find the Given number is Even or odd ..?
public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("The Given number is EVen !!");
		} else {
			System.out.println("The Given number is Odd !!");
			System.out.println("yes !! its odd ");
		}

		sc.close();
		System.out.println("main method ended !");

	}

}
