package com.multithreading;

class Jthread1 extends Thread {
	@Override
	public void run() {
		System.out.println("J1 Started ");
		for (int i = 0; i <= 50; i++) {
			System.out.println("J1 : " + i);
		}

		System.out.println("J1 ended ");
	}

}

class Jthread2 extends Thread {

	Jthread3 j3;

	Jthread2(Jthread3 j3) {
		this.j3 = j3;
	}

	@Override
	public void run() {
		System.out.println("J2 Started ");
		for (int i = 50; i <= 100; i++) {

			if (i == 75) {
				try {
					j3.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("J2 : " + i);

		}

		System.out.println("J2 ended ");
	}
}

class Jthread3 extends Thread {
	@Override
	public void run() {
		System.out.println("J3 Started ");
		for (int i = 100; i <= 150; i++) {
			System.out.println("J3 : " + i);
		}

		System.out.println("J3 ended ");
	}
}

public class ThreadDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Jthread1 j1 = new Jthread1();

		Jthread3 j3 = new Jthread3();

		Jthread2 j2 = new Jthread2(j3);

		j1.start();
		j2.start();
		j3.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended ");

	}
}
