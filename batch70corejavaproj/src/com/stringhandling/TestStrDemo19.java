package com.stringhandling;

import java.util.Arrays;
import java.util.Scanner;

//WAP to print Whether the Given Two Strings Anagram or not ..? 
// Silent --> Listen 
// eat = ate 
// race = care
// heart = earth 

public class TestStrDemo19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First String ");
		String s1 = sc.next();

		System.out.println("Enter another String ");
		String s2 = sc.next();

		if (s1.length() != s2.length()) {
			System.out.println("The Given Strings are not anagram ");
			return;
		}

		char[] ch1 = s1.toCharArray();// {'r','a','c','e'}
		char[] ch2 = s2.toCharArray();// {'c','a','r','e'}

		Arrays.sort(ch1);// a c e r
		Arrays.sort(ch2);// a c e r

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("The Given Strings are anagram");
		} else {
			System.out.println("The given String are not anagram");
		}

	}

}
