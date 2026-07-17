package com.java8features;

interface In3 {
	void addition(int a, int b);
}

public class Testj8Demo3 {

	public static void main(String[] args) {

		In3 i = (a, b) -> {
			int sum = a + b;
			System.out.println("addition of Two values: " + sum);
		};

		i.addition(100, 200);
	}

}
