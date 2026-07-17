package com.java8features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestJ8Demo12 {

	public static void main(String[] args) {

		Predicate<Integer> p1 = (a) -> a > 18;
		System.out.println(p1.test(22));
		System.out.println(p1.test(17));

		Predicate<String> p2 = s -> s.contains("s");
		System.out.println(p2.test("srikanth"));// false

		Predicate<Double> p3 = sal -> sal > 10000.00;
		System.out.println(p3.test(25000.00));

		System.out.println("****************************");

		Function<Integer, Integer> f1 = a -> a * a;
		System.out.println(f1.apply(10));
		
		Function<String, Integer> f2 = s-> s.length();
		System.out.println(f2.apply("Java is simple"));
		
		System.out.println("****************************");
		
		Consumer<String> c1 = (s) -> System.out.println(s);
		c1.accept("Java 8 is more more simple then before !");
		
		System.out.println("****************************");
		Supplier<Date> s1 = () -> new Date();
		System.out.println(s1.get());
		
	}

}
