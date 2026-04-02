package com.logicalstatements01.loops;

import java.util.Scanner;

///Q) WAP to print Math table from 0 to 20 Based on Given number..?
///input is : 9 
///output should be 
/// 9 X 1 = 9 
////9 X 2 = 18 
////9 X 3 = 27 
////9 X 4 = 36 
////9 X 5 = 45 
////9 X 6 = 54 
////9 X 7 = 63 
////9 X 8 = 72 
////9 X 9 = 81
///9 X 10 = 90  
///
public class TestLPDemo9 {

	public static void main(String[] args) {

		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which number to Proceed for table:");
		int n = sc.nextInt();
		System.out.println("Enter upto where you want to print : ");
		int n1 = sc.nextInt();

		for (int i = 1; i <= n1; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}

	}

}
