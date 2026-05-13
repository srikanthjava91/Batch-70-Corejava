package com.oops.abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Meow meow !!");
	}

	@Override
	public void walk() {
		System.out.println("Cat walk !!");
	}

	@Override
	public void sleep() {
		System.out.println("cat can sleep anytime !");
	}

	@Override
	public void eat() {
		System.out.println("car eats rat !");

	}

	@Override
	public void run() {
		System.out.println("Cat can run like anything !");

	}

//	Yes Default methods, we can override, but not with default keyword.
//	if we use default keyword in classes, will get a CE like : 
//	CE : default  methods are allowed only in interfaces.
	@Override
	public void drink() {
		System.out.println("Cat drinks milk more ");
	}

}
