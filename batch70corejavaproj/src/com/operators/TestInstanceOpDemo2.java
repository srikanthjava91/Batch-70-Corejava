package com.operators;

class A {

}

class B extends A {

}

public class TestInstanceOpDemo2 {

	public static void main(String[] args) {
		System.out.println("main methad started ");

		A a = new A();
		B b = new B();

		System.out.println(a instanceof A);// true
		System.out.println(b instanceof B);// true
		System.out.println(b instanceof A);// true
		System.out.println(a instanceof B);// false

	}

}
