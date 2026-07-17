package com.multithreading;

public class ThreadDemo4 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(Thread.currentThread());
		System.out.println("Name  " + Thread.currentThread().getName());
		

		ThreadDemo4 t = new ThreadDemo4();
		t.start();

		for (int i = 0; i <= 50; i++) {
			System.out.println("main ");
		}
		System.out.println("main method ended");

	}

	@Override
	public void run() {
		System.out.println("run method started : ");

		Thread.currentThread().setName("Java");
		System.out.println("Name  : " + Thread.currentThread().getName());
		Thread.currentThread().setPriority(MIN_PRIORITY);
		
		System.out.println("Priority  : " + Thread.currentThread().getPriority());
		
		for (int i = 0; i <= 50; i++) {
			System.out.println("run ");
		}

		System.out.println("run method started : ");
	}

}
