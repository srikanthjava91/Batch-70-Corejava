package com.logicalstatements01.loops;

import java.util.Scanner;

/// WAP to print Factors of Given numbers using for loop..? 
///WAP to find the Given number is Perfect or not ..? 
///Perfect number means : sum of factors is equals to Given number.
///input 6 : 
///factors of 6  : 1 2 3  6 --> 1+ 2+ 3 = 6  
///
///input 9 
///factors of 9 : 1 3 9 
///
///input 24: 
///factors of 24 : 1 2 3 4 6 8 12 24
///
///input 28 : 
///Factors of 28 : 1 2 4 7 14 28  --> 1+ 2+ 4+7+ 14 = 28 
/// 
public class TestLPDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;

//		int j = 0;
//		for (; j < 10; j++) {
//			System.out.println(j + "j value : ");
//		}

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			System.out.println("the given number is perfect ");
		} else {
			System.out.println("the given number is not a perfect ");
		}
		System.out.println(n);
	}
}
