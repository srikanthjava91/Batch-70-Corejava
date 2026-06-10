package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestSetDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(7, "Dhoni");
		m.put(18, "Virat");
		m.put(34, "Pandya");
		m.put(35, "Pandya");

		System.out.println(m);
		System.out.println("--------------------------");

//		Constructs a new, empty set; 
//		the backing HashMap instance has default initial capacity (16) 
//		and load factor (0.75).
		
//		HashSet internally working based on HashMap 
//		HashMap Creates internal table with 16 Capacity.

//		Whatever we are sending the value for a HashSet will consider as Key for Internal HashMap then 
//		What is the value for these key's ..? --> ans is  PRESENT = new Object() for every key.

//		Then How the key will be storing in Buckets ..? key % Bucket size 16 

//		But, once elements reaching Threshold --> Current Capacity(16) * (Load factor)0.75 --> 12  
//		Then the Capacity will be Double like --> 32 Then the calculations also changing with 32 only.

//		Every Bucket is Linked List internally, When we have more than one elements in a same Bucket, 
//		it's arranging inside Linked List will considered as hash Collision.
		
//		In one Bucket, the Linked List size is Greater than 8 then From Java 8 onwards its using
//		RED BLACK TREE for Better performance.

//		18 34 99 52 37 27 45 77 
		Set<Integer> set = new HashSet<>();// map = new HashMap<>();
		
		set.add(18);
		set.add(18);
		set.add(18);
		set.add(34);
		set.add(37);
		set.add(27);
		set.add(45);
		set.add(52);
		set.add(77);
		set.add(99);

		System.out.println(set);

	}

}
