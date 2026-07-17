package com.java8features;

interface In12 {
	int add(int a, int b);
}

interface In11 {
	void hello();

	void show();
}

class Test1 {
	void method1() {
		System.out.println("method1 called from Test1");
	}
}

public class TestJ8Demo11 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		In12 i = (a, b) -> a * b;

//		Anonymous Inner class extends Test1
		Test1 t1 = new Test1() {
			@Override
			void method1() {
				System.out.println("method1 called from Anonymos");
			}
		};

		t1.method1();

//		Anonymous Inner class Implements In1
		In11 i1 = new In11() {
			@Override
			public void hello() {
				System.out.println("Hello Good afternoon");
			}

			@Override
			public void show() {
				System.out.println("Hello Show !!");
			}
		};

		i1.hello();
		i1.show();

	}
}
