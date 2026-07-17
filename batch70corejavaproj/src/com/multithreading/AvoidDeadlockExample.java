package com.multithreading;

public class AvoidDeadlockExample {

	public static void main(String[] args) {

		final String resource1 = "Ratan";
		final String resource2 = "Vimal";

		Thread t1 = new Thread(() -> {

			synchronized (resource1) {

				System.out.println("Thread-1 locked Resource1");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				synchronized (resource2) {
					System.out.println("Thread-1 locked Resource2");
				}
			}
		});

		Thread t2 = new Thread(() -> {

			// Same order as Thread-1
			synchronized (resource1) {

				System.out.println("Thread-2 locked Resource1");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				synchronized (resource2) {
					System.out.println("Thread-2 locked Resource2");
				}
			}
		});

		t1.start();
		t2.start();
	}
}
