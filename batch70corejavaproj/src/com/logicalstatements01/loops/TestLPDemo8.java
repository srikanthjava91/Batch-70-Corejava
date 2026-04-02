package com.logicalstatements01.loops;

// Q) WAP to print sum of all the numbers using for loop like print sum of first 10 numbers..? 
//Q) WAP to print product of all the numbers using for loop like print product of first 10 numbers..?
public class TestLPDemo8 {

	public static void main(String[] args) {
		System.out.println("main method strated !!");

		int sum = 1;

		for (int i = 1; i <= 10; i++) {
			sum = sum * i;// 55
		}
		System.out.println("SUm of all the values: " + sum);

		System.out.println("main method ended !!");
	}

}
