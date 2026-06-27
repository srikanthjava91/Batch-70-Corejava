package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompDemo1 {

	public static void main(String[] args) {

		List<String> li1 = new ArrayList<>();

		li1.add("Mango");
		li1.add("Banana");
		li1.add("Apple");
		li1.add("Grapes");
		li1.add("Orange");
		li1.add("Pineapple");

		System.out.println(li1);
		Collections.sort(li1);
		System.out.println(li1);

		List<Integer> li = new ArrayList<>();

		li.add(6);
		li.add(6);
		li.add(10);
		li.add(14);
		li.add(5);
		li.add(8);
		li.add(3);

		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);

	}

}
