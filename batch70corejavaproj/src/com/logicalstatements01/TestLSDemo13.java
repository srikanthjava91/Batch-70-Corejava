package com.logicalstatements01;

import java.util.Scanner;

public class TestLSDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome to Vcube Vegetable & Fruits market ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Category :");
		String catg = sc.next();

		String yn = "";

		do {
			switch (catg) {

			case "veg" -> {
				System.out.println("Enter a Items for Vegetables: ");
				String item = sc.next();

				switch (item) {
				case "tmt" -> System.out.println("Tomoto & the Price is 20rs Per Kg");
				case "ptt" -> System.out.println("POtato & the price is 40rs per kg");
				case "dmst" -> System.out.println("Drumstick & the price is 100 rs per kg");

				case "on" -> System.out.println("Onion & the price is 30rs per kg");
				case "cr" -> System.out.println("Carrot & the price is 50rs per kg");
				case "bt" -> System.out.println("Beetroot & the price is 45rs per kg");
				case "cbg" -> System.out.println("Cabbage & the price is 25rs per kg");
				case "clf" -> System.out.println("Cauliflower & the price is 60rs per kg");
				case "brj" -> System.out.println("Brinjal & the price is 35rs per kg");
				case "cuc" -> System.out.println("Cucumber & the price is 20rs per kg");
				case "pch" -> System.out.println("Spinach & the price is 15rs per bunch");
				case "mgr" -> System.out.println("Mango & the price is 80rs per kg");
				default -> System.out.println("Entered Item is not availble : ");
				}

			}

			case "fru" -> {

				System.out.println("Enter a Items for Fruits: ");
				String item = sc.next();

				switch (item) {
				case "mgr" -> System.out.println("Mango & the pirce is 300 per kg ");
				case "orn" -> System.out.println("Orange & the pirce is 200 per kg ");

				case "apl" -> System.out.println("Apple & the price is 250rs per kg");
				case "bnn" -> System.out.println("Banana & the price is 60rs per dozen");
				case "grp" -> System.out.println("Grapes & the price is 120rs per kg");
				case "png" -> System.out.println("Pineapple & the price is 90rs per piece");
				case "pmy" -> System.out.println("Papaya & the price is 70rs per kg");
				case "wml" -> System.out.println("Watermelon & the price is 40rs per kg");
				case "mst" -> System.out.println("Muskmelon & the price is 50rs per kg");
				case "grn" -> System.out.println("Guava & the price is 80rs per kg");
				case "str" -> System.out.println("Strawberry & the price is 300rs per kg");
				case "kwi" -> System.out.println("Kiwi & the price is 20rs per piece");

				default -> System.out.println("Item not available");
				}

			}

			default -> System.out.println("ENtered Category is invalid");

			}

			System.out.println("Do you want to procedd click Y or n ..?: ");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
	}

}
