package com.collections;

import java.util.Hashtable;
import java.util.Map;

public class TestMapDemo6 {

	public static void main(String[] args) {

		Map<Integer, String> m = new Hashtable<>();
		m.put(1, "Srikanth");
		m.put(2, "Vinay");
		m.put(3, "Raj");
		m.put(4, "Lokesh");
		m.put(5, "Mahesh");
//		m.put(null, null);
//		m.put(null, "Hello");
//		m.put(6, null);
//		m.put(7, null);

		System.out.println(m);
	}
}
