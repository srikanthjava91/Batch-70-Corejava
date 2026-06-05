package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo3 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();

		li.add(7);
		li.add(18);
		li.add(45);
		li.add(4);
		li.add(1);
		li.add(5);
		li.add(8);
		li.add(8);
		li.add(8);
		li.add(8);

		List<Integer> subLi = li.subList(0, 4);// 7 18 45 4

		System.out.println(subLi);
		subLi.add(99);
		subLi.add(101);
		

		System.out.println(li.indexOf(8));
		System.out.println(li.lastIndexOf(8));
		System.out.println(li.remove(li.indexOf(8)));
		System.out.println(li);

	}

}
