package com.javaintro;

public class TestDemo7 {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !!");
	}

	static TestDemo7 t = new TestDemo7();

	static void hello() {
		System.out.println("Hello method started ");
		TestDemo7 t11 = new TestDemo7();
		System.out.println(t11);
		System.out.println("Hello method ended ");
	}

	public static void main(String[] args) {
		TestDemo7 t7 = new TestDemo7();
		TestDemo7 t8 = new TestDemo7();
		TestDemo7 t9 = new TestDemo7();

//		// com.javaintro.TestDemo7@1dbd16a6
//		System.out.println(t7);
//		// com.javaintro.TestDemo7@7ad041f3
//		System.out.println(t8);
//		// com.javaintro.TestDemo7@251a69d7
//		System.out.println(t9);
//		// com.javaintro.TestDemo7@251a69d7
//		System.out.println(t);

//		1) 
		t7 = null;// Nullify the object

//		2)
		TestDemo7 t10 = new TestDemo7();
		t10 = t8;// Re-assign the Object

//		3) 
		new TestDemo7();// Anonymous object
		
//		4)
		hello();//Objects inside the methods eligible for Garbage.

		System.out.println(t7);// null
		System.out.println(t8);// 1dbd16a6
		System.out.println(t9);// 7ad041f3
		System.out.println(t);// 251a69d7
		System.out.println(t10);// 7344699f --> 1dbd16a6

//		Runs the garbage collector in the Java Virtual Machine.
//		Calling the gc method suggests that the Java Virtual Machine 
//		expend effort toward recycling unused objects in order to make the 
//		memory they currently occupy available for reuse by the Java Virtual Machine.
		System.gc();

	}
}
