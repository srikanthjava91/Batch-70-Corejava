package com.arrays;

//2D Array : 
//Whenever we want to represent rows & columns then we can go for 2D arrays.
public class TestArrayDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		int[][] arr = new int[3][4];// 0 1 2 ---> 0 1 2 3

		System.out.println(arr.length);// 3
		System.out.println(arr[1].length);// 4

		// 00 01 02 03 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("main method ended !!");
	}
}
