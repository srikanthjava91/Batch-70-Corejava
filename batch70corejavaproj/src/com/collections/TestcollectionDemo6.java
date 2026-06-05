package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestcollectionDemo6 {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();

		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Pineapple");
		System.out.println(fruits.size());

		Object[] objs = fruits.toArray();

		for (Object obj : objs) {
			System.out.println(obj);
		}
		
		System.out.println("------------------");

		Collection<String> veggies = new ArrayList<>();

		veggies.add("Banana");
		veggies.add("Potato");
		veggies.add("Tomato");
		veggies.add("Carrot");

		System.out.println(fruits.retainAll(veggies));
		System.out.println(fruits);

	}
}
