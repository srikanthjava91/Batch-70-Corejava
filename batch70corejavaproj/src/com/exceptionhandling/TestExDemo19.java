package com.exceptionhandling;

public class TestExDemo19 {

	{
		System.out.println("instance called ");
//		TestExDemo19 t = new TestExDemo19();
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		int[] arr = new int[2147483647];

		TestExDemo19 t = new TestExDemo19();

		System.out.println("main method ended ");

	}

}
