package com.collections;

import java.util.Map;
import java.util.WeakHashMap;

class Customer {

	@Override
	public String toString() {
		return "Srikanth";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called  from customer !");
	}

}

//WeakHashMap
//HashMap always dominates garbage Collector, 
//So we can Say, HahsMap Object will not eligible for Garbage collections even though objects are nullified.
//Garbage Collector dominates WeakHashMap, So Object are eligible for Garbage collection when objects are nullified.
public class TestMpDemo5 {

	public static void main(String[] args) throws InterruptedException {

		Map<Object, String> map = new WeakHashMap<>();
		Customer c = new Customer();

		map.put(c, "Java");
		System.out.println(map);

		c = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);

	}

}
