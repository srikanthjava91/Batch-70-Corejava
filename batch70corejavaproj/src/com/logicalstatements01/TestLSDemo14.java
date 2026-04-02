package com.logicalstatements01;

import java.util.Scanner;

public class TestLSDemo14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks Percentage : ");
		int marksP = sc.nextInt();// 90

		String result = switch (marksP / 10) {

		case 10, 9 -> {
			yield "Excellent";
		}

		case 8 -> {
			yield "Very Good";
		}

		case 7 -> {
			yield "Good";
		}

		case 6 -> {
			yield "Average";
		}

		case 5 -> {
			yield "Pass";
		}

		default -> {
			yield "Fail";
		}
		};

		System.out.println("Result: " + result);

	}
}
