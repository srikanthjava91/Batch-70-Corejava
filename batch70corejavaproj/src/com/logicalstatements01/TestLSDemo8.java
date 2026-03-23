package com.logicalstatements01;

import java.util.Scanner;

//WAP to print Cricketer info Based on the Jersey Number ..? 
public class TestLSDemo8 {

	public static void main(String[] args) {

		System.out.println("Cricketer info !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Jersey number to get the details ");
		int jno = sc.nextInt();

		switch (jno) {
		case 7:
			System.out.println("Thala for a Reason ");
			System.out.println("The One & only the best & coole captial Mr.MS DHoni");
			break;

		case 18:
			System.out.println("The KIng Kohli");
			System.out.println("The Most Consitent Cricket player in India");
			break;

		case 45:
			System.out.println("The HIT Man");
			System.out.println("A good Captian & also A Good Hitter ");
			break;

		default:
			System.out.println("Entered Jersey number details not added here.");

		}

	}

}
