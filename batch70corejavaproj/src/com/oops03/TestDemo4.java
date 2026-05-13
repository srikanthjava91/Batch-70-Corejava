package com.oops03;

//byte short int long float double 
public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		TestDemo4 t = new TestDemo4();
		t.addition();
//		t.addition(10);
//		t.addition(10.5F);
		t.addition(10, 20);
		//The method addition(int, float) is ambiguous for the type TestDemo4

	}

	void addition(char c) {
		System.out.println("one char arg method called ");
	}

	void addition() {
		System.out.println("no args method called ");
	}

//	void addition(int a) {
//		System.out.println("one int arg method called ! " + a);
//	}

//	void addition(float a) {
//		System.out.println("one float arg method called ! " + a);
//	}

//	void addition(double a) {
//		System.out.println("one double arg method called ! " + a);
//	}

//	void addition(int a, int b) {
//		System.out.println("two arg method called ! " + (a + b));
//	}

//	void addition(int a, float b) {
//		System.out.println("one int one float arg method called ! " + (a + b));
//	}

//	void addition(float a, float b) {
//		System.out.println("one float one float arg method called ! " + (a + b));
//	}

	void addition(float a, int b) {
		System.out.println("one float one int arg method called ! " + (a + b));
	}

}
