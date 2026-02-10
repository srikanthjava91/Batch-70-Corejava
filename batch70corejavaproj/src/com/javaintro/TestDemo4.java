package com.javaintro;

//methods 
public class TestDemo4 {

	public static void show() {
		System.out.println(Thread.currentThread());
		System.out.println("show method called ");
		System.out.println("show method called ");
		System.out.println("show method called ");
	}

//	public static void main(String arg[]) {
//		System.out.println("Hello main ");
//	}
	
	void main() {

		System.out.println("main method started ");
		System.out.println(Thread.currentThread());
		TestDemo4 t = new TestDemo4();
		// Calling instance method
		t.hello();

		// calling the static method
		show();
		System.out.println("main method ended");
	}

	public void hello() {
		System.out.println(Thread.currentThread());
		System.out.println("hello method called !");
		System.out.println("hello method called !");
		System.out.println("hello method called !");
	}

}
