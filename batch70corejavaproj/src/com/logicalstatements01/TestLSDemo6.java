package com.logicalstatements01;

import java.util.Scanner;

public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age ..");
		int age = sc.nextInt();

		System.out.println("Do you Have License ..?");
		boolean hasLicense = sc.nextBoolean();

		if (age > 18) {
			if (hasLicense) {

				System.out.println("Are you Indian ..? ");
				boolean areYouIndian = sc.nextBoolean();

				if (areYouIndian) {
					System.out.println("You are eleigible Driving !");
				} else {
					System.out.println("Your age & License is good to go but You dont have a Citizinship !!");
				}

			} else {
				System.out.println("Your age is Okay to proceed but you must need to provide the License !!");
			}

		} else {
			System.out.println("You are eleigible Driving !");
		}

	}

}
