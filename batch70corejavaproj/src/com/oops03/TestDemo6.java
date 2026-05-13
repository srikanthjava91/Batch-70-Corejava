package com.oops03;

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("mian method started ");

		TestDemo6 t = new TestDemo6();
		t.add("");
		t.add("", 10);
		t.add("", 10, 20);
		t.add("", 10, 20, 30);
		t.add("", 10, 20, 30, 40);
		t.add("", 10, 20, 30, 40, 50);
	}

	// var arg method
	// The variable argument type int of the method add must be the last parameter
	void add(String s, int... values) {
		int sum = 0;
		for (int i : values) {
			sum = sum + i;
		}
		System.out.println("sum : " + sum);

	}

}
