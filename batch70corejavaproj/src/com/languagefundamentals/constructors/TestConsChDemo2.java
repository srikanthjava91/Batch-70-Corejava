package com.languagefundamentals.constructors;

class Animal1 {
	String name;
	int age;

	public Animal1() {
		System.out.println("Animal1 no arg constructor called !");
	}

}

class Monkey  extends Animal1{

	public Monkey() {
		super();
		System.out.println("Monkey no-arg constructor called !!");
	}

}

public class TestConsChDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		Monkey m1 = new Monkey();

		System.out.println("main method ended !");
	}

}
