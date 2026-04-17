package com.logicalstatements01.loops;

public class TestLPDemo25 {

	static int gcd(int a, int b) {

		while (b != 0) {
			int temp = b;// 56 12 8
			b = a % b;
			a = temp;
		}
		return a;

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 4;
		int b = 10;

		int gcdValue = gcd(a, b);
		System.out.println("GCD Value : " + gcdValue);

		int lcm = (a * b) / gcdValue;
		System.out.println("LCM : " + lcm);

	}

}
