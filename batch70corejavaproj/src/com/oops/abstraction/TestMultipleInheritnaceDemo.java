package com.oops.abstraction;

interface In1 {

	void method1();

	void method2();

	default void method4() {
		System.out.println("method4 is called ");
	}

}

interface In2 {
	void method2();

	void method3();

}

//In Java, Multiple Inheritance is possible with interfaces because, we have unique implementation inside the classes.
//And when we create Object for In3 with TestIn, 
//	- method1 is referring In1 interface 
//  - method3 is referring In3 interface
//  - method2 is referring based on order of extends. 

interface In3 extends In1, In2 {

}

class TestIn implements In3 {

	@Override
	public void method1() {
		System.out.println("method1 called ");
	}

	@Override
	public void method2() {
		System.out.println("method2 called ");
	}

	@Override
	public void method3() {
		System.out.println("method3 called ");
	}

}

public class TestMultipleInheritnaceDemo {

	public static void main(String[] args) {

		In3 i = new TestIn();
		i.method1();
		i.method2();
		i.method3();
	}

}
