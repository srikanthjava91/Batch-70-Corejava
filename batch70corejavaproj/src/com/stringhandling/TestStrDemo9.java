package com.stringhandling;

public class TestStrDemo9 {

	public static void main(String[] args) {

		char[] ch = { 'J', 'a', 'v', 'a' };
		String s1 = String.copyValueOf(ch);
		System.out.println(s1);

		char[] ch1 = { 'J', 'a', 'v', 'a', 'i', 's', 's', 'i', 'm', 'p', 'l', 'e' };
		String s2 = String.copyValueOf(ch1, 6, 6);// From 6 to 6 characters
		System.out.println(s2);

		System.out.println("------------------------");
		String[] names = { "J2SE", "J2EE", "Spring", "Spring Boot", "Microservieces", "jdbc","J2Me" };
		for (String name : names) {
			if (name.toLowerCase().startsWith("j") && name.toUpperCase().endsWith("E")) {
				System.out.println(name);// jdbc
			}

		}

	}

}
