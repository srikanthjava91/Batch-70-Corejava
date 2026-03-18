package com.operators;

//Unary Operators : 
//++ -- + - 
//Post-Increment 
//Pre-Increment 

public class TestUnaryOperators {

	public static void main(String[] args) {

		int a = +10;// unary plus
		System.out.println(a);// 10

		int b = -10;// unary minus
		System.out.println(b);

		int i = 10;
		int j = 5;

		System.out.println("*****************************");
		System.out.println(++i);// i = i +1 -> i = 11
		System.out.println(++j);// j = j+1-> j = 6
		System.out.println(i++);// i = i+1 -> i = 12 but printing 11
		System.out.println(j++);// j = j +1 --> j = 7 but printing 6
		System.out.println(++i);// i = i + 1 --> i = 13
		System.out.println(j++);// j = j +1 --> j = 8 but printing 7
		System.out.println(i++);// i = i + 1 --> i = 14 but printing 13
		System.out.println(++j);// j = j+1 --> j = 9

		System.out.println("i value : " + i);// 12 13 11 14
		System.out.println("j value : " + j);// 7 8 6 9

	}

}
