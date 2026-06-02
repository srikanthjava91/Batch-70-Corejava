package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Collection<String> bowlers = new ArrayList<>();
		bowlers.add("Bhumrah");
		bowlers.add("Siraj");
		bowlers.add("Bhuvi");
		bowlers.add("Aswin");
		bowlers.add("Harshadeep");
		bowlers.add("Harshit Rana");
		bowlers.add("Kuldeep");
		System.out.println(bowlers);

		Collection<String> batsmens = new ArrayList<>();
		batsmens.add("Virat");
		batsmens.add("Rohit");
		batsmens.add("Iyer");
		batsmens.add("Dhoni");
		batsmens.add("Tilak");
		batsmens.add("Vaibhav");
		batsmens.add("Gill");
		batsmens.add("Rahul");
		System.out.println(batsmens);

		Collection<String> indianTeam = new ArrayList<>();

		indianTeam.addAll(bowlers);
		indianTeam.addAll(batsmens);

		bowlers.clear();
		System.out.println(bowlers);
		System.out.println(indianTeam);//

		System.out.println(batsmens.contains("Srikanth"));// false
		System.out.println(batsmens.contains("Virat"));// true

		Collection<String> allRounders = new ArrayList<>();
		allRounders.add("Jadeja");
		allRounders.add("Srikanth");

		System.out.println(indianTeam.containsAll(bowlers));// true
		System.out.println(indianTeam.containsAll(allRounders));// true
		
		indianTeam.clear();
		if(!indianTeam.isEmpty()) {
			System.out.println("Welcome to Indian Team !! All the best ");
		}

	}

}
