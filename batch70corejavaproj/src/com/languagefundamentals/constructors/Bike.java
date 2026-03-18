package com.languagefundamentals.constructors;

public class Bike {

	String brand;
	String model;
	String color;
	double price;
	double milage;

	Bike(String brand, String model) {
		this(brand, model, 100000.00);
		System.out.println("Two-arg constructor called !");
	}

	Bike(String brnad, String model, double price, String color) {
		System.out.println("Four-arg constructor called ");
		this.brand = brnad;
		this.model = model;
		this.price = price;
		this.color = color;

	}

	Bike(String brand, String model, double price) {
		this(brand, model, price, "blue");
		System.out.println("three-arg constructor called !");
	}

	Bike(String brand) {
		this(brand, "unknown");
		System.out.println("one arg contructor called !");
	}

	Bike() {
		this("unknown");
		System.out.println("no-arg constructor called from Bike");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Bike b1 = new Bike();
		System.out.println(b1.brand);

		Bike b2 = new Bike("RE");
		System.out.println("Brand : " + b2.brand);// null
		System.out.println("Model : " + b2.model);
//
		Bike b3 = new Bike("RE", "Classic");
		b3.show();

		Bike b4 = new Bike("Yamaha", "FZ-s", 200000.00);
		b4.show();

		Bike b5 = new Bike("RE", "Himalaya", 250000, "Black");
		b5.show();
	}

	void show() {
		System.out.println("Model : " + model);
		System.out.println("Brand : " + brand);
		System.out.println("Prica e: " + price);
		System.out.println("Color of the Bike : " + color);
		System.out.println("************************");
	}

}
