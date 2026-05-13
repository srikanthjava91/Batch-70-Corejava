package com.oops.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Bow bow !!");
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk and it runs like anything !");
	}

	@Override
	public void sleep() {
		System.out.println("DOg can sleep morning times and wake ups at Night times ");
	}

	@Override
	public void eat() {
		System.out.println("Dogs eat max meats only ");
	}

	@Override
	public void run() {
		System.out.println("Dogs run faster ");

	}

//	static  methods, we cannot override but, 
//	we can use same static method inside the child classes
//	which is not method overriding will consider that as method hiding.

//	@Override
//	static void breath() {
//		System.out.println("Ofcourse Every animal Breaths to survive !!");
//	}

}
