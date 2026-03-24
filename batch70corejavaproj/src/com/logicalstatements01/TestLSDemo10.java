package com.logicalstatements01;

import java.util.Scanner;

//WAP to calculate the values using switch cases 
public class TestLSDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter b number ");
		int b = sc.nextInt();

		System.out.println("Enter a symobl to proceed for calculation : ");
		String symb = sc.next();

		switch (symb) {

		case "+" -> {
			System.out.println("addition ");
			System.out.println(a + b);

		}
		case "-" -> {
			System.out.println("subtraction ");
			System.out.println(a - b);
		}
		case "*" -> {
			System.out.println("Multiplication ");
			System.out.println(a * b);
		}

		case "%" -> {
			System.out.println("Modulus to find reminder :  ");
			System.out.println(a % b);
		}
		case "/" -> {
			System.out.println("Division to find quotient : ");
			System.out.println(a / b);
		}
		default -> System.out.println("Invalid Symbol to proceed !!");

		}

	}

}
