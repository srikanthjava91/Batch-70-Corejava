package com.oops03;

public class TestDemo5 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		hello("Srikanth");
		hello(null);
	}

	static void hello(String str) {
		System.out.println("str called ");
		System.out.println(str);
	}

	static void hello(Object obj) {
		System.out.println("obj called ");
		System.out.println(obj);
	}

}
