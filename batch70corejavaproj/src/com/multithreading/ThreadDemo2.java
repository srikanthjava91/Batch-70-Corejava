package com.multithreading;

public class ThreadDemo2 implements Runnable {

	public static void main(String[] args) {
		System.out.println("main method started ");

		ThreadDemo2 r = new ThreadDemo2();// Runnable Object
		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("mian : " + i);
		}

		System.out.println("main method ended ");

	}

	@Override
	public void run() {
		System.out.println("run method started ");

		for (int i = 1; i <= 10; i++) {
			System.out.println("run : " + i);
		}

		System.out.println("run method ended ");
	}

}
