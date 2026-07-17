package com.multithreading;

class DThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("run :" + i);

		}
	}
}

public class ThreadDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		DThread d = new DThread();
		d.setDaemon(true);
		d.start();

		System.out.println(d.isDaemon());

		for (int i = 0; i < 2; i++) {
			System.out.println("main :" + i);

		}
	}

}
