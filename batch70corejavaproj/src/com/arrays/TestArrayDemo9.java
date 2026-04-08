package com.arrays;

import java.util.Scanner;

public class TestArrayDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size : ");

		int size = sc.nextInt();// 5
		String[] arr = new String[size];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();
		}

		for (String str : arr) {
			if (str.toLowerCase().startsWith("s") || str.endsWith("a")) {
				System.out.println(str);
			}
		}

	}

}
