package com.stringhandling;

public class TestStrDemo1 {

	public static void main(String[] args) {

		String s1 = "Java";// String Literals --> SCP : String Constant pool-> 1 Object
		String s2 = "Java";// 0 objects
		String s3 = "Java";// 0 objects

		String s4 = new String("Srikanth");// String object Literal --> Heap Area + SCP -> 2 objects
		String s5 = new String("Srikanth");// String object Literal --> Heap Area --> 1 Object
		String s6 = "Srikanth"; // String Literals --> SCP --> 0 objects
		
		
		String s7 = new String(s6);// 1 Object : Creating Object with Another String 
		String s9 = s5;//Re-assigining and Creating String 
		
		String s8 = s6 + s3;//Concatenation Operator // SrikanthJava
		
		
		
		
		
		

	}

}
