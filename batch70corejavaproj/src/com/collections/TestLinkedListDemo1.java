package com.collections;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedListDemo1 {

	public static void main(String[] args) {

		// Constructs an empty list.
		List<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(9);
		ll.add(18);
		ll.add(8);
		ll.add(15);
		ll.add(10);
		ll.add(null);
		ll.add(null);
		ll.add(100);

		ll.addFirst(50);
		ll.addLast(500);
		System.out.println(ll);
		System.out.println(ll.reversed());

	}
}
