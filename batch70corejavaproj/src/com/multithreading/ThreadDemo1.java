package com.multithreading;

public class ThreadDemo1 extends Thread {

//	@Override
//	public void start(){
//		System.out.println("Hello start !!");
//	}
	
	public static void main(String[] args) {

		System.out.println("main method strated ");
		System.out.println(Thread.currentThread());

		ThreadDemo1 t = new ThreadDemo1();
		t.start();
		t.start();
		t.run(10);

		for (int i = 0; i <= 10; i++) {
			System.out.println("main :" + i);
		}

		System.out.println("main method ended ");
	}

	void run(int i) {
		System.out.println("run called !");
	}

	@Override
	public void run() {
		System.out.println("run method strated ");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("show :" + i);
		}
		System.out.println("run method ended ");
	}
}
