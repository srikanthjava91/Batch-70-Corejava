package com.logicalstatements01;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Are you Attending classes Regularly ");

		boolean areYouAttendtingClassRegularly = sc.nextBoolean();
		boolean areYouAttendingWeeklyTest = sc.nextBoolean();
		boolean areYouAttendingMockInterview = sc.nextBoolean();

		if (areYouAttendtingClassRegularly && areYouAttendingWeeklyTest && areYouAttendingMockInterview) {
			System.out.println("You will understand the classes properly & you will get a JOb in 6 months!!");
		} else {
			System.out.println(
					"You are a Rich Kid !! you no need to learn anything, Just You can depend on your parents & friends  !!");
		}

	}

}
