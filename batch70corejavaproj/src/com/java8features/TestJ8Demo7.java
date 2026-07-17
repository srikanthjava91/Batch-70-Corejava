package com.java8features;

interface In7 {
	public int squareit(int n);
}

public class TestJ8Demo7 {

	public static void main(String[] args) {

//		In7 i = (n) -> n * n;
//		System.out.println(i.squareit(10));

		In7 i = (n) -> {
			return n * n;
		};
		System.out.println(i.squareit(100));

	}

}
