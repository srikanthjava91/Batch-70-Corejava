package com.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWriteArraylistDemo {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> al1 = new CopyOnWriteArrayList<>();
		al1.add("Vinay");
		al1.add("Srikanth");
		al1.add("Subhan");
		al1.add("Madhan");
		al1.add("Vishwa");

//		Fail Safe with CopyOnWriteArrayList
		Iterator<String> itr1 = al1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			al1.add("Java");
		}

		System.out.println("***********************");

		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

//		Fail Safe with CopyOnWriteArrayList
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			al.add(100);
		}
		
		
		System.out.println(al1);

////		Fail Fast with ArrayList with iterator
//		Iterator<Integer> itr = al.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			al.add(100);
//		}

//				Fail Fast with ArrayList with for each loop 
//		Fail Fast 
//		for (Integer i : al) {
//			System.out.print(i + " ");
//			al.add(60);
//		}

//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
////			al.add(100);
//		}

		System.out.println(al);

	}

}
