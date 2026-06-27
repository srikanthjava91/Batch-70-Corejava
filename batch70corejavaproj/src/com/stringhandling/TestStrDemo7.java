package com.stringhandling;

public class TestStrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		String str = "Java Srikanth";
//		Returns the character (Unicode code point) at the specified index. 
		System.out.println(str.codePointAt(1));// 97

//		Returns the character (Unicode code point) before the specified index.
//		If the index is zero it will be -1 but -1 not range from 0 to length-1 so we will get 
//		StringIndexOutOfBoundsException
		System.out.println(str.codePointBefore(0));// 74

//		Returns the number of Unicode code points in the specified text range of this String
		System.out.println(str.codePointCount(1, 6));
	}
}
