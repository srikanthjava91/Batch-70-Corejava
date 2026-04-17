package com.starpatterns;

public class TestStarPattern5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 6; k >= i; k--) {
//				System.out.print("* ");
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
