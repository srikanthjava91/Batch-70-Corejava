package com.exceptionhandling;

public class TestExDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try ");
			String str = "Srikanth";

			int x = str.indexOf('r');//
			System.out.println(x);

			System.out.println(10 / 0);
			System.out.println("Hello");

		}

//		Unreachable catch block for NullPointerException. 
//		It is already handled by the catch block for Exception
		catch (NullPointerException e) {
			System.out.println("in catch of NE");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("in catch of A E ");
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("in catch of E ");
			e.printStackTrace();
		}

		System.out.println("main method ended ");

	}

}
