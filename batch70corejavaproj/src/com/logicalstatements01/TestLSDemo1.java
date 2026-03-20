package com.logicalstatements01;

import java.util.Scanner;

//WAP to print the Given age is Eligible for Voting or Driving ..? 
public class TestLSDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();// 17

		if (age > 18) {
			System.out.println("You are ELigible for Voting & Driving !!");
			System.out.println("Congrtulations !!");
		}else {
			System.out.println("Aray Niku inka time undi ra !!");
			System.out.println("You are not ELigible for Voting & Driving !!");
		}

		System.out.println("main method ended !!");

	}

}
