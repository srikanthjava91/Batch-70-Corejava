package com.oops.abstraction;

public abstract class TestAbsDemo implements TestIn1 {

	int id;
	static String name = "Vcube";

	// constructor
	TestAbsDemo() {
		System.out.println("constructor called from TestABS");
	}

//	 normal or concrete method
	public void method6() {
		System.out.println("method 6 alled from Abs class ");
	}

//	abstract methods 
	@Override
	public abstract void method7();

	// override methods
	@Override
	public void method1() {

	}

	@Override
	public void method2() {

	}

	@Override
	public void method3() {

	}

	@Override
	public void method4() {

	}

	@Override
	public void method5() {

	}

}
