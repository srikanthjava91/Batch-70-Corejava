package com.collections;

class TestDemo2 {

	TestDemo2() {
		show();
	}

	void show() {
		System.out.println("prent");
	}

}

public class TestDemo1 extends TestDemo2 {

	int x = 10;

	public static void main(String[] args) {
		new TestDemo1();
	}

	void show() {
		System.out.println(x);// 0
	}
}
