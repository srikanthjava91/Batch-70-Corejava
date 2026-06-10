package com.collections;

import java.util.ArrayList;

public class TestArrayListDemo {

	public static void main(String[] args) {

//		 Constructs an empty list with an initial capacity of ten.
		ArrayList<Integer> al = new ArrayList<>(20);

		al.add(5);
		al.add(6);
		al.add(4);
		
		al.add(3);
		al.add(2);
		al.add(1);
		
		al.add(3);
		al.add(10);
		al.add(8);
		al.add(3);
		al.add(null);
//		When we add more than 10 elements,
//		while adding 11th element internally Re-sizeable array re-sizing with 15
//		formula : Current_Capacity *3/2
		al.add(6); 
		System.out.println(al.size());// --> 11 --> 
		System.out.println(al);
		System.out.println();

	}

}
