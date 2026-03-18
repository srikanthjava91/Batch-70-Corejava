package com.languagefundamentals.constructors;

public class Vehicle {

	String model;
	String brand;
	
	Vehicle(){
		System.out.println("Vehicle no arg constructor called ");
	}
	
	public Vehicle(String model, String brand) {
		super();
		System.out.println("Vehcle class paremetrized  constructor called ");
		this.model = model;
		this.brand = brand;
	}

	public static void main(String[] args) {
		System.out.println("Vehicle class main method started !");
	}
}

//Implicit super constructor Vehicle() is undefined for default constructor. Must define an explicit constructor
//Whenever we extends Parent class & that parent class contains only Parameterized 
//constructor then child class default constructor always called the parent class default or no arg so, 
//if we have any parameterized constructor in parent we must need to maintain  no arg constructor.
class Car1 extends Vehicle {
	public static void main(String[] args) {
		System.out.println("Car1 class main method started ");

		Car1 c1 = new Car1();
		
		System.out.println("Car1 class main method ended ");
	}
}