package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		System.out.println(list.size());//
		list.add(0, 10);
		list.add(1, 20);

		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(3, null);
		list.add(null);
		list.add(null);
		list.add(null);
//		
		System.out.println(list);

	}

}
