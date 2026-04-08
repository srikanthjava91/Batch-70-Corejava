package com.arrays;

public class TestArrayDemo4 {

	public static void main(String[] args) {
		System.out.println("main  method started ");

//		int[] numbers = { 10 };
//		System.out.println(numbers);// [I@2b2fa4f7
//		System.out.println(numbers[0]);// 10

		int[] numbers1 = { 10, 20, 35, 40, 55 };
		for (int n : numbers1) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}

	}

}
