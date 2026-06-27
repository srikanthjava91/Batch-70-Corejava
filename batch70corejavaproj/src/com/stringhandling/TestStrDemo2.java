package com.stringhandling;

public class TestStrDemo2 {

	public static void main(String[] args) {

		String city = "Hyderabad";
		String city1 = "Hyderabad";
		String city2 = "Hyderabad";
		String city3 = "Hyderabad";
		
		System.out.println(city);
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		
		System.out.println("---------------");
		String c4 = "Bangalore";
		
		
		city3 = "Bangalore";
		System.out.println(city);
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		System.out.println(c4);
		
		System.out.println(city3.hashCode());
		System.out.println(c4.hashCode());
		
		
		
	}

}
