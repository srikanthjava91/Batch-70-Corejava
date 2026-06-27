package com.stringhandling;

public class TestStrDemo23 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		StringBuffer sb = new StringBuffer("Srikanth");
		System.out.println(sb);

//		CE : Type mismatch: cannot convert from String to StringBuffer
//		StringBuffer sb1  = "Srikanth Java";//String Literals only for String but not for any class 
//		System.out.println(sb1); 

		String s1 = "Java";
		s1.concat("Srikanth");
		System.out.println(s1);//Java 
		
		//StringBuffer & StringBuilder both are Mutable 
//		If our requirement is Synchronization related functionalities then go for StrinBuffer 
//		If we want work multiple threads parallel  then will use StringBuilder for better performance
		StringBuffer sb1 = new StringBuffer("Srikanth");
		sb1.append("Java");
		System.out.println(sb1);
		
		
		StringBuilder sb2 = new StringBuilder("Srikanth");
		sb2.append("Java");
		System.out.println(sb2);
		
		System.out.println("main method ended ");

	}

}
