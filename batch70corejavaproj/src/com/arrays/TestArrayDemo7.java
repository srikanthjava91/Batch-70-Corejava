package com.arrays;

//Q) WAP to print min & max elements from Given Array..? 
public class TestArrayDemo7 {

	public static void main(String[] args) {
		System.out.println("main method strated");

		int[] arr = { 18, 45, 4, 7, 1, 8 };
		int min = arr[0];// 18 4 1
		int max = arr[0];// 18

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			} else if (arr[i] > max) {
//				max = arr[i];
//			}
//		}

		for (int a : arr) {
			if (a < min) {
				min = a;
			} else if (a > max) {
				max = a;
			}
		}

		System.out.println("Minimum value from an array is : " + min);
		System.out.println("Maximum value from an array is : " + max);
	}

}
