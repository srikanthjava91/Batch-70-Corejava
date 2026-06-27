package com.stringhandling;

import java.util.Scanner;

//WAP to find vowels and consonant from Given String.
public class TestStrDemo18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine().toLowerCase();
		char[] ch = str.toCharArray();

		int vowCount = 0;
		int consCount = 0;
		int digiCout = 0;

		for (char c : ch) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowCount++;
				} else {
					consCount++;
				}
			} else if (Character.isDigit(c)) {
				digiCout++;
			}
		}

		System.out.println("Vowles count is : " + vowCount);
		System.out.println("Consonant Count is : " + consCount);
		System.out.println("DIgit COunt is : " + digiCout);

	}

}
