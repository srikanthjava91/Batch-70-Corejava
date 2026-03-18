package com.languagefundamentals.constructors;

public class Car {

	String model;
	String brand;
	double price;
	String color;

	// no arg constructor
	Car() {

	}

	Car(String model, String brand, double price, String color) {
		System.out.println("Parameterized constructor called !!");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Car c1 = new Car("Sonet", "KIA", 1300000.00, "RED");
		c1.carInfo();

		Car c2 = new Car();// CE
		c2.carInfo();

		System.out.println("main method ended ");

	}

	void carInfo() {
		System.out.println("Model of the Car : " + model);
		System.out.println("Brand of the Cra : " + brand);
		System.out.println("Price of theCar : " + price);
		System.out.println("color of the Car : " + color);
	}

}
