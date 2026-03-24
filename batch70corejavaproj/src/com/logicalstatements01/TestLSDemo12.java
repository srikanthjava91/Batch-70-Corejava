package com.logicalstatements01;

import java.util.Scanner;

//
public class TestLSDemo12 {

	static String getDayInfo(String day) {

		switch (day) {
		case "Monday":
			return "Lazy day";
		case "Tuesday", "Wedenesday", "Thursday":
			return "Normal Days";
		case "Friday":
			return "Weekend mode started ";
		case "Saturday", "Sunday":
			return "Weekend with Holidays";
		default:
			return "entered day is invalid";

		}

	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day : ");
		String day = sc.next();

		System.out.println(getDayInfo(day));
		sc.close();

	}

}
