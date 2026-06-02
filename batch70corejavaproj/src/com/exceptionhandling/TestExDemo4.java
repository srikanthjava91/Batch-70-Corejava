package com.exceptionhandling;

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = null;

		try {
			arr = new int[3];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		for (int a : arr) {
			System.out.println(a);
		}

		System.out.println("main method ended ");
	}

}
