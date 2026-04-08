package com.logicalstatements01.loops;

import java.util.Scanner;

public class TestLPDemo23 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {
			System.out.println("Enter a number: ");
			int a = sc.nextInt();

			System.out.println("Enter b number: ");
			int b = sc.nextInt();

			System.out.println("Enter a Symbol to proceed like + - * !!");
			String symb = sc.next();

			switch (symb) {
			case "+" -> System.out.println(a + b);
			case "-" -> System.out.println(a - b);
			case "*" -> System.out.println(a * b);
			case "%" -> System.out.println(a % b);
			case "/" -> System.out.println(a / b);
			default -> System.out.println("Invalid symbol to proceed ");
			}

			System.out.println("DO you want to Continue ..? Clik Y for Yes N for No ");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("Y"));

	}

}
