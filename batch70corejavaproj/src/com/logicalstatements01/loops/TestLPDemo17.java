package com.logicalstatements01.loops;

import java.util.Scanner;

//WAP to print sum of the Give number using while loop ..? 
//input : 345
//output : 12 
public class TestLPDemo17 {

	public static void main(String[] args) {
		System.out.println("maiun method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 345
		int r = 0;
		int sum = 0;

		while (n != 0) {
			r = n % 10;// 123 % 10 =3, 12%10 =2,1%10=1
			n = n / 10;// 123/10 =12, 12/10=1, 1/10 = 0
			sum = sum + r;
		}

		System.out.println("SUm of the Given number is : " + sum);
	}

}
