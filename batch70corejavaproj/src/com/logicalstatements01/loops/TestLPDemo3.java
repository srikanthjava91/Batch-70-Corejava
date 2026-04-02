package com.logicalstatements01.loops;

///Q) WAP to print Even & odd numbers using for loop from 0 to 100..? 
public class TestLPDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println("Even numbers : ");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("**************************");
		System.out.println("odd numbers : ");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1 && i != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
