package com.logicalstatements01.loops;

import java.util.Scanner;

//Q) WAP to print the Reverse Number of a Give Number ..? 
//Q) WAP to find the Given number is Palindrome or not ..? 
 class TestLPDemo18 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number: ");
		int n = sc.nextInt();// 456
		int temp = n;// 456
		int r = 0;
		int rev = 0;

		while (n != 0) {
			r = n % 10;// 456%10=6, 45%10 =5, 4%10= 4
			n = n / 10;// 456/10 = 45, 45/10 = 4, 4/10 =0
			rev = rev * 10 + r;// 6, 65,654

		}

		System.out.println("The Reverse number of a Given number is : " + rev);

		if (temp == rev) {
			System.out.println("The Given number is Palindrome ");
		} else {
			System.out.println("The Given number is not a Palindrome ");
		}

		System.out.println("main method ended ");
	}

}
