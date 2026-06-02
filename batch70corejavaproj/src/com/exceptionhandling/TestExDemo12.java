package com.exceptionhandling;

//finally dominates return and so finally executing without fail;
public class TestExDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started ");
//		System.exit(100);
		try {
			System.out.println("in try ");
			System.exit(10);//Initiates the Runtime##shutdown shutdown sequence of the Java Virtual Machine. 
//			return;
		} catch (Exception e) {
			System.out.println("in catch ");
		} finally {
			System.out.println("in finally ");
		}
		System.out.println("main method ended ");
	}

}
