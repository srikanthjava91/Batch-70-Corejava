package com.javaintro;

public class Cricketer {

//	Declaration
//	static variables or data
	static int countryId;
	static String countryName;

	// Non-static or instance variables or data
	int jerseyNo;
	String cricketerName;

	void main() {
		System.out.println("main method started ");
		System.out.println("Welcome to Indian Cricket team !!");

//		Initializing the static data 
		countryId = 91;
		countryName = "India";

//		instance data, we cannot access inside the static area.
//		How can we access instance data inside a main method or static methods ..? 
//		ans : Through Object creation with Object reference variable.

		// Object creation in Java with a class and with new keyword
		// Cricketer is a class name
		// msd is Object reference variable
		System.out.println("*********Object1 Info **********");
		Cricketer msd = new Cricketer();

//		Representing or accessing the static data
		System.out.println("Country ID : " + countryId);// 0
		System.out.println("Country Name : " + countryName);// null

		// Initializing the instance data
		msd.jerseyNo = 7;
		msd.cricketerName = "Mahendra Singh Dhoni";

		// Accessing the instance data
		System.out.println("Jersey Number : " + msd.jerseyNo);// 0
		System.out.println("Cricketer Name : " + msd.cricketerName);// null

		System.out.println("Object2 info *************");
		Cricketer virat = new Cricketer();

		virat.jerseyNo = 18;
		virat.cricketerName = "King Kohli";
		System.out.println("COuntry ID : " + countryId);// 91
		System.out.println("Country Name  : " + countryName);// India
		System.out.println("Jersey NO : " + virat.jerseyNo);// 0
		System.out.println("Cricketer Name : " + virat.cricketerName);// null

		System.out.println("main method ended !");
	}

}
