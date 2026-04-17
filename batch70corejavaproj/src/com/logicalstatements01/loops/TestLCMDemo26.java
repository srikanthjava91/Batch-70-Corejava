package com.logicalstatements01.loops;

public class TestLCMDemo26 {

	public static void main(String[] args) {

		int a = 4, b = 10;
		int max = Math.max(a, b);// 10

		while (true) {
			if (max % a == 0 && max % b == 0) {
				System.out.println("LCM is : " + max);
				break;
			}
			max++;
		}

	}

}
