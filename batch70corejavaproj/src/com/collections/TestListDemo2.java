package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		List<String> girls = new ArrayList<>();

		girls.add("Triveni");
		girls.add("Tulasi");
		girls.add("Anajana");
		girls.add("Muntaj");

		List<String> boys = new ArrayList<>();

		boys.add("Vinay");
		boys.add("Tilak");
		boys.add(0, "Sasank");
		boys.add("Ayan");
		boys.add("Siddu");
		boys.add(1, "Bharath");
		boys.add("Vinay");
		boys.add(1, "Srikanth");
		boys.add(0, "Swamy");
		boys.add(null);
		boys.add(null);

		List<String> students = new ArrayList<>();

		students.addAll(boys);
		students.addAll(girls);

		List<String> trainers = new ArrayList<>();
		trainers.add("Srikanth");
		trainers.add("Vishwanath");

		students.addAll(1,trainers);
		System.out.println(students);//

		System.out.println("--------------------------");

		//// Swamy Sasank Srikanth Bharath Vinay Tilak Ayan Siddu Vinay
		System.out.println(boys);
		System.out.println(boys.set(0, "Abhishek"));// Replaces the element at the specified position in this list with
													// the specified element (optional operation).
		System.out.println(boys);

		System.out.println("**************************");
		for (int i = 0; i < boys.size(); i++) {
			System.out.println(boys.get(i));
		}

		System.out.println("**************************");
		for (String b : boys) {
			System.out.println(b);
		}

		System.out.println("**************************");
		Iterator<String> it = boys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(boys);

		System.out.println("main method ended ");

	}

}
