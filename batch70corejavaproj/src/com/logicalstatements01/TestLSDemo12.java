package com.logicalstatements01;

import java.util.Scanner;

//
public class TestLSDemo12 {

	static String getDayInfo(String day) {

		return switch (day) {
		case "Monday" -> {
			yield "Lazy day";
		}
		case "Tuesday", "Wedenesday", "Thursday" -> {
			yield "Normal Days";
		}
		case "Friday" -> {
			yield "Weekend mode started ";
		}
		case "Saturday", "Sunday" -> {
			yield "Weekend with Holidays";
		}
		default -> {
			yield "entered day is invalid";
		}
		
		
		};
		
//		System.out.println("Hello");//Unreachable code
		

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
