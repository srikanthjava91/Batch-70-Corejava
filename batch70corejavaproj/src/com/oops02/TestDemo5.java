package com.oops02;

abstract class TestAbs {

	abstract void method1();
}

class Test1 extends TestAbs {

	@Override
	void method1() {
		System.out.println("method1 called !!");
	}

}

abstract class Test2 extends Test1 {
	@Override
	abstract void method1();

}

public class TestDemo5 {

	public static void main(String[] args) {

	}

}
