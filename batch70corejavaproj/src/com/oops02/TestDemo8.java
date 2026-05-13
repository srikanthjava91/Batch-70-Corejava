package com.oops02;

interface A {
	public abstract void display();
}

class B implements A {
	@Override
	public void display() {
		System.out.println("Good Morning ");
	}

}

class C implements A {
	@Override
	public void display() {
		System.out.println("Good Evening ");
	}
}

///if we extends Two classes :CE:  Syntax error on tokens, delete these tokens
class D extends C {

	public static void main(String[] args) {
		D d = new D();
		d.display(); // Good Evening
	}

}

public class TestDemo8 {

	public static void main(String[] args) {

	}

}
