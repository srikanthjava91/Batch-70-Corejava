package com.arrays;

public class TestDemo1 {

	int x = show();

	TestDemo1() {
		System.out.println("constructor called ");
	}

	{
		System.out.println("instance block ");
	}

	int show() {
		System.out.println("show");
		return 10;
	}

	public static void main(String[] args) {

		System.out.println("main method started ");
		new TestDemo1();

//		int[] arr = { 1, 2, 3 };
//		arr[0] = arr[0]++;
//		System.out.println(arr[0]);

	}

}
