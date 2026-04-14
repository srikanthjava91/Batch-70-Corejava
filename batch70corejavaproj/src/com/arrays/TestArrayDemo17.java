package com.arrays;

import java.util.Scanner;

//Array Rotation Right to Left 
public class TestArrayDemo17 {

	// 1 2 3 4 5 6 7 8
	public static void arrayReverse(int[] arr, int start, int end) {
		int temp = 0;
//		0< 7
//		1 < 6
//		2 < 5 
//		3 < 4 
//		4 <3 //false
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}

	}

	public static void arrayRotation(int[] arr, int r) {

		int start = 0;
		int end = arr.length - 1;// 7

//		Step 1: Reverse Total Array 
		arrayReverse(arr, start, end);

//		Step 2: Reverse First Half array 
		arrayReverse(arr, start, r - 1);

//		Step 3: Reverse Second Half Array
		arrayReverse(arr, r, end);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Enter how  many times you want to Rotate .?");
		int r = sc.nextInt();

		System.out.println("Before Rotation !");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		// rotate the Array Right left based on R value
		arrayRotation(arr, r);

		System.out.println();
		System.out.println("After Rotation !");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
