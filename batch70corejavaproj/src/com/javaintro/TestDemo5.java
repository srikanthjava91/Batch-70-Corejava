package com.javaintro;

//Note : If we want to call instance methods into static area, 
//we must need to create object. 
public class TestDemo5 {
	 static TestDemo5 t = new TestDemo5();

	void method5() {
		System.out.println("method5 called ");
	}

	static void method3() {
		System.out.println("method3 called ");
		t.method5();
	}

	void method4() {
		System.out.println("method4 called ");
	}

	static void method1() {
		System.out.println("method1 called ");
		
		t.method2();
	}

	// In instance area, we can call static methods directly & also we can instance
	// methods directly
	void method2() {
		System.out.println("method2 called ");
		method3();
		method4();
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		method1();
	}
}
