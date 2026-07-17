package com.java8features;

import java.util.function.Predicate;

public class TestJ8Demo13 {

	public static void main(String[] args) {

		String[] names = { "Axar Patel", "Washignton", "Shubman Gill", "Sheryash", "Virat", "Rohit" };

		Predicate<String> p1 = (s) -> s.length() > 5;
		Predicate<String> p2 = (s) -> s.contains("h");
		Predicate<String> p3 = p1.and(p2).negate();

		for (String name : names) {
			if (p3.test(name)) {
				System.out.println(name);
			}
		}

	}

}
