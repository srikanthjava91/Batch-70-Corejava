package com.logicalstatements01.loops;

public class TestLPDemo22 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main method started !!");

		int a = 5;

		do {
			System.out.println("Good morning !!");
			Thread.sleep(100);
			a++;
		} while (a < 10);

		System.out.println("main method ended !!");

	}

}
