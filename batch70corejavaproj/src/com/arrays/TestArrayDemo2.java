package com.arrays;

public class TestArrayDemo2 {

	public static void main(String[] args) {

		// Declaration Creation in single line
		int[] numbers = new int[10];// 0 to 9

		numbers[0] = 101;
		numbers[1] = 103;
		numbers[2] = 105;
		numbers[3] = 106;
		numbers[4] = 109;
		numbers[5] = 110;
		numbers[6] = 111;
		numbers[7] = 112;
		numbers[8] = 100;
		numbers[9] = 113;

		//Enhanced for loop or for each loop 
		for (int i : numbers) {
			System.out.println(i);
		}

//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] % 2 == 0) {
//				System.out.print(numbers[i] + " ");
//			}
//		}

	}

}
