package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "java is simple in vcube java is best";
		str = str.replace('i', 'e');
		System.out.println(str);

		str = str.replace("java", "Spring Boot");
		System.out.println(str);
		System.out.println("************************");

		String str1 = "Java 500090 hyderabad 1234";
		str1 = str1.replaceAll("\\d", "X");
		System.out.println(str1);

		String str2 = "AMBCD1245A";
		str2 = str2.replaceAll("\\D", "A");
		System.out.println(str2);

		System.out.println("Enter a Phone number ");
		String phone = sc.next();

		boolean phneStatus = phone.matches("^[6-9]{1}[0-9]{9}$");
		System.out.println(phneStatus);

		// ABDCE1234A
		System.out.println("Enter a PAN");
		String pan = sc.next();

		boolean panStatus = pan.matches("^[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}$");
		System.out.println(panStatus);

	}

}
