package com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSetDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Set<String> s = new HashSet<>();
		s.add("X");
		s.add("B");
		s.add("D");
		s.add("C");
		s.add("F");
		s.add("G");
		s.add(null);
		s.add(null);
		s.add(null);

		System.out.println(s);

		System.out.println("main method ended !!");
	}

}
