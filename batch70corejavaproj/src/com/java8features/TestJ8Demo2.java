package com.java8features;

@FunctionalInterface
interface In2 {
	void sqrt(int n);
}

public class TestJ8Demo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		In2 i = n -> System.out.println(n*n);

//		In2 i = (int n) -> {
//			System.out.println(n * n);
//		};
		i.sqrt(100);

	}

}
