package com.java8features;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestJ8Demo19 {

	public static void main(String[] args) {

		Function<Integer, String> f1 = (i) -> {
			String info = "";

			if (i > 18) {
				info = "Eligible";
			} else {
				info = "Not ELigible";
			}

			return info;
		};

		System.out.println(f1.apply(22));
		System.out.println("**********************************");
		
		
		BiFunction<String, String, Integer> bif = (s1, s2) -> s1.length() + s2.length();
		System.out.println(bif.apply("Javais", "Simple"));
	}
}
