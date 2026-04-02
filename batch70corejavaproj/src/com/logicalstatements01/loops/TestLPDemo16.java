package com.logicalstatements01.loops;

import java.util.Scanner;

//WAP to find the count of Given number ..? 
//input : 123
//output : 3
public class TestLPDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 123
		int r = 0;
		int count = 0;

		while (n != 0) {
			r = n % 10;// 123 % 10 =3, 12%10 =2,1%10=1
			n = n / 10;// 123/10 =12, 12/10=1, 1/10 = 0
			count++;
		}

		System.out.println("count of Given number is : " + count);
		System.out.println("main method ended !!");

	}

}
