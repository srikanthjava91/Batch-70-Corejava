package com.arrays;

public class TestArrDemo11 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		int[][] numbers = new int[2][3];
		// 0 1 --> 0 1 2
		// 00 01 02
		// 10 11 12

		System.out.println(numbers.length);// 2
		System.out.println(numbers[0].length);// 3
		System.out.println(numbers[1].length);// 3
		System.out.println("****************************");

		numbers[0][0] = 101;
		numbers[0][1] = 102;
		numbers[0][2] = 103;

		numbers[1][0] = 104;
		numbers[1][1] = 105;
		numbers[1][2] = 106;

		for (int[] n1 : numbers) {
			for (int n : n1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		// Rows
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				System.out.print(numbers[i][j] + " ");
//			}
//
//			System.out.println();
//
//		}

	}

}
