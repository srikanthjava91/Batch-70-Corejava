package com.arrays;

//Q) WAP to print the array in Sorting Order using Bubble Sort ..? 
public class TestArrayDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		int[] arr = { 1, 2, 3, 4, 5, 6 };// 6 --> 0 1 2 3 4 5
		// 30 40 20 15 5 2
		// 30 20 40 15 5 2
		// 30 20 15 40 5 2
		// 30 20 15 5 40 2
		// 30 20 15 5 2 40
		int temp = 0;
		int count = 0;
		int count1 = 0;

		System.out.println(" Array : Before sort");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();
		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			boolean swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;

				}
				count1++;

			}

			if (!swapped) {
				break;
			}

		}

		System.out.println(count);
		System.out.println(count1);
		System.out.println("Sorted Array : After sort");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
