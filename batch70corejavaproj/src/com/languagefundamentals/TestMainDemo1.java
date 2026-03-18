package com.languagefundamentals;

public class TestMainDemo1 {

	public static void main(String[] names) {

		System.out.println("main method strated ");

//		 String to int values we can use below method
		int i = Integer.parseInt(names[0]);
		int i1 = Integer.parseInt(names[1]);

		System.out.println(i + i1);

//		System s = new System();
//		String s = new String();

		for (String n : names) {
			System.out.println(n);
		}
	}
}
