package com.exceptionhandling;

import java.util.Scanner;

//In Java, Finally block executes always, whether there is a problem or not.
//Mainly we use finally block for closing the Connections or Resources.
//ex: Scanner, Connection File related classes.

public class TestExDemo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number ");
		int a = sc.nextInt();

		try {
			System.out.println("in try ");
			System.out.println(10 / 0);

		} catch (Exception e) {
			System.err.println("in catch");

		} finally {
			System.out.println("in finally");
			sc.close();
		}
	}
}
