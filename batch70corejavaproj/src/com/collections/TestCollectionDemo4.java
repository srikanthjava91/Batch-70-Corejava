package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo4 {

	public static void main(String[] args) {

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

		Iterator<String> itr = batsmens.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("***************************");
		// enhanced for loop or for each loop
		for (String batsMen : batsmens) {
			System.out.println(batsMen);
		}

	}

}
