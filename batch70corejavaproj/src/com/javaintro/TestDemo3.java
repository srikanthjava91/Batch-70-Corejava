package com.javaintro;

public class TestDemo3 {
	// instance block
	{
		System.out.println("instance block1 called ");
	}

	// static block
	static {
		System.out.println("static block1 called ");
	}

	// main method
	void main() {
		System.out.println("main method started ");
	}
}
