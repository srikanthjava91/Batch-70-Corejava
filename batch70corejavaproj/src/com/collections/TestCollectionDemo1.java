package com.collections;

import java.util.Collection;
import java.util.ArrayList;

public class TestCollectionDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		Object[] obj = new Object[5];
		
		obj[0] = 10;
		obj[1] = "Srikanth";
		obj[2] = 5.8;
		obj[3] = 100000.00;
		obj[4] = 'c';
		
		for(Object o:obj) {
			System.out.println(o);
		}
		System.out.println("------------------------");
		
		

//		Collection is a raw type.
//		References to generic type Collection<E> should be parameterized
		Collection<Integer> c = new ArrayList<>();

		c.add(7);
		c.add(1);
		c.add(18);
		c.add(45);
		c.add(10);
		c.add(4);
		c.add(44);
		c.add(77);
		c.add(77);
		c.add(77);

		System.out.println(c);

	}

}
