package com.languagefundamentals.constructors;

class Animal {
	String name = "Puppy";

	void show() {
		System.out.println("Animal " + name);
	}
}

class Dog extends Animal {

	String name = "Sweety";

//	note : this super can use only in instance area but not in static area
	@Override
	void show() {
		System.out.println("Dog " + super.name);
	}

//	Cannot use super in a static context
//	Cannot use this in a static context
//	static void display() {
//		System.out.println(this.name);
//	}

}

public class TestConsChDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Dog d = new Dog();
		d.show();

		System.out.println("main method ended !!");
	}
}
