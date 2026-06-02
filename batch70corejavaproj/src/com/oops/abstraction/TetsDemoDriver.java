package com.oops.abstraction;

public class TetsDemoDriver {

	public static void main(String[] args) {

//		we cannot create objects for abstract class directly like this.
//		Then, how can we call abstract class normal methods..? 
//		ans : By using, Child Object, 
//		internally Abstract class creates the object implicitly for abstract class.

//		Cannot instantiate the type TestAbsDemo
//		TestAbsDemo t = new TestAbsDemo();

		TestAbsDemo t1 = new TestDemo1();
		t1.method1();
		t1.method2();
		t1.method3();
		t1.method4();
		t1.method5();
		t1.method6();
		
		System.out.println("*********************************");
		TestAbsDemo t2 = new TestDemo2();
		t2.method1();
		t2.method2();
		t2.method3();
		t2.method4();
		t2.method5();
		t2.method6();
		

	}

}
