package com.javaintro;

public class TestDemo6 {
	
	//Native methods do not specify a body
	native void hello();

	void main() {
		System.out.println("instance main method called ");
	}

	public static void main(String[] args) {
		System.out.println("static main method called ");
		TestDemo6 testDemo6 = new TestDemo6();
		testDemo6.main();
		testDemo6.hello();
	}
}
