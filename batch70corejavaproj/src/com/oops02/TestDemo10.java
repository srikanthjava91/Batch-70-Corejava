package com.oops02;

class Parent {

	Parent() {
		System.out.println(" Parent constructor called!");
	}
}

class Child {
	Child() {

		System.out.println("child constructor called!");
	}
}

//Multiple markers at this line
//- Syntax error, insert "}" to complete Block
//- Syntax error on token ",", { expected
class SubChild extends Child {

	SubChild() {
		System.out.println("sub child constructor called!");
	}
}

public class TestDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		SubChild s1 = new SubChild();

	}
}
