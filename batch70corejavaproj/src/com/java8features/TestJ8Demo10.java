package com.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Lambda Expressions vs Collections
public class TestJ8Demo10 {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(10, 3, 20, 2, 30, 5, 40, 50);
		
		Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
		
		Collections.sort(al, c);
		System.out.println(al);
	}
}
