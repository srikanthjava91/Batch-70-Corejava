package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();

		m.put(7, "Dhoni");
		m.put(18, "Virat");
		m.put(45, "Rohit");
		m.put(33, "Pandya");
		m.put(34, "Pandya");
		m.put(1, "Rahul");
		m.put(9, "Srikanth");
		m.put(2, null);
		m.put(3, null);
		
		//the previous value associated with key, or null if there was no mapping for key. 
		System.out.println(m.put(77, "Gill"));//null
		System.out.println(m.put(9, "Venkat"));//Srikanth
		

		//In map, it always, Old value is replacing with new value when we have Duplicate key.
		System.out.println(m);//Venkat

	}

}
