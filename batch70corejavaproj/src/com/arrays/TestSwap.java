package com.arrays;

public class TestSwap {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int temp = 0;

		temp = x;
		x = y;
		y = temp;

		System.out.println("X value : " + x);
		System.out.println("Y value : " + y);
		System.out.println("****************************");

		int a = 10;
		int b = 20;

		a = a + b;// 30
		b = a - b;// 10;
		a = a - b;// 20

		System.out.println("A value : " + a);
		System.out.println("B value :  " + b);

	}

}
