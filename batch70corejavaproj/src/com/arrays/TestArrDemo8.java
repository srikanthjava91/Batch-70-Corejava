package com.arrays;

import java.util.Scanner;

//Q) WAP to Read the elements from Scanner..? 
public class TestArrDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size : ");
		int size = sc.nextInt();// 5

		int[] arr = new int[size];

		System.out.println("Enter the elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println("main method ended !!");

	}

}
