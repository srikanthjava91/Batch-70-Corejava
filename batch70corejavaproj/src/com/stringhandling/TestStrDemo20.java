package com.stringhandling;

import java.util.Scanner;

//Remove Duplicates from String 
public class TestStrDemo20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a STring : ");
		String str = sc.next();// java
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (result.indexOf(c) == -1) {
				result = result + c;
			}
		}

		System.out.println("Removed Duplicate elements from Given String is : " + result);

	}

}
