package com.arrays;

//Q) WAP to print Duplicate Elements from an array 
//Time Complexity : O(n^2)
//Space Complexity :O(1)
public class TestArrayDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 1, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
		}

		System.out.println("main method ended ");

	}

}
