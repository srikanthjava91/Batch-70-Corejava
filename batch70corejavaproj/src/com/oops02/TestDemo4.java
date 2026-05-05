package com.oops02;

class TestA {
	public static void main(String[] args) {
		final int x = 10;
//		x= 200;//The final local variable x cannot be assigned. 
//		It must be blank and not using a compound assignment
		
		System.out.println(x);
		System.out.println("main From calss A ");
	}

	void method1() {

	}
}

class TestB extends TestA {

	public static void main(String[] args) {
		System.out.println("main From calss B ");
	}

	void method1() {

	}

}

public class TestDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
