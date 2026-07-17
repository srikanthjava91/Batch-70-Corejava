package com.java8features;

@FunctionalInterface
interface In8 {
	void hello(String s);
}

public class TestJ8Demo8 {
	public static void main(String[] args) {
		In8 i = (s) -> System.out.println(s.length());
		i.hello("java is simple");
	}
}
