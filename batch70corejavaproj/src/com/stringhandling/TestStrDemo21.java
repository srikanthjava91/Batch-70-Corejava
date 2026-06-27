package com.stringhandling;

import java.util.Scanner;

//Print Duplicate elements 
public class TestStrDemo21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a STring : ");
		String str = sc.nextLine();// javav
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(str.indexOf(c) != str.lastIndexOf(c) && result.indexOf(c) == -1) {
				System.out.println(c);//av
				result = result +c;//av
			}
			
			
		}
	}

}
