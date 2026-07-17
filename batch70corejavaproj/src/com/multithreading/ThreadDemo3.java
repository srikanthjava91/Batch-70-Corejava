package com.multithreading;

class Test {
	// 1000 methods
}

class VideoThread extends Test implements Runnable {

	@Override
	public void run() {
		System.out.println("video started : ");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("video Thread : ");
		}
		System.out.println("video ended : ");
	}
}

class AudioThread extends Thread {

	@Override
	public void run() {
		System.out.println("Audio started : ");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Audio Thread : ");
		}

		System.out.println("Audio ended : ");
	}
}

class TimerThread extends Thread {

	@Override
	public void run() {
		System.out.println("Timer started : ");
		System.out.println(Thread.currentThread());
		Thread.yield();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Timer Thread : ");
		}

		System.out.println("Timer ended : ");
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(Thread.currentThread());

		VideoThread v1 = new VideoThread();
		Thread t = new Thread(v1);

		AudioThread a1 = new AudioThread();
		TimerThread t1 = new TimerThread();

		t.start();

		a1.start();

		t1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main ");
		}

		System.out.println("main method ended ");
	}
}
