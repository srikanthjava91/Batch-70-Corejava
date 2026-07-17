package com.java8features;

@FunctionalInterface
interface In6 {
	public void m1(int a, int b);
}

public class TestJ8Demo6 {

	public static void main(String[] args) {
		In6 t = (int a, int b) -> System.out.println("hello" + (a + b));
		t.m1(10, 20);
	}
}
