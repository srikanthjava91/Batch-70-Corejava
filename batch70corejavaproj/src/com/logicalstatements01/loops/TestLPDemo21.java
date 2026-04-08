package com.logicalstatements01.loops;

import java.util.Scanner;

//WAP to Restrict Login only for 3 attempts..?
public class TestLPDemo21 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		String username = "admin";
		String password = "Admin#123";
		int attempts = 0;

		Scanner sc = new Scanner(System.in);

		while (attempts < 3) {
			System.out.println("Enter your user name : ");
			String user = sc.next();

			System.out.println("Enter a password : ");
			String pass = sc.next();

			if (user.equalsIgnoreCase(username) && pass.equals(password)) {
				System.out.println("Login Successfull !!!");
				break;
			} else {
				System.err.println("Invalid User credentials !!");
				attempts++;
			}

		}

		if (attempts == 3) {
			System.err.println("You account Locked for 24 for hrs !!");
		}

		System.out.println("main method ended ");

	}
}
