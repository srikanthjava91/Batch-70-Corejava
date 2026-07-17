package com.java8features;

///Lambda Expressions vs Multithreading
public class TestJ8Demo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("run : " + i);
			}
		};
		Thread th = new Thread(r);
		th.start();
		
		Runnable r1 = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("run1 : " + i);
			}
		};
		
		Thread th1 = new Thread(r1);
		th1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method started ");

	}

}
