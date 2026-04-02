package com.logicalstatements01.loops;

public class TestLPDemo15 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started ");
		int i = 1;
		while (10 >= i) {
			System.out.println("Hello ");
			i++;
			Thread.sleep(100);
		}
		System.out.println("main method ended ");
	}
}
