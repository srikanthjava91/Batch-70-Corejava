package com.exceptionhandling;

public class TestexDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try1");

			try {
				System.out.println("in try2");
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.err.println("in catch2 ");
			} finally {
				System.out.println("In finally 2");
			}
			System.out.println(10 / 0);
			System.out.println("Hello");
		} catch (Exception e) {

			try {
				System.out.println("in try3");
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.err.println("in catch3 ");
			} finally {
				System.out.println("In finally 3");
			}
			System.err.println("in catch1");
		}

		finally {

			try {
				System.out.println("in try4");
			} catch (Exception e1) {
				System.err.println("in catch4 ");
			} finally {
				System.out.println("In finally 4");
			}
			System.out.println("in finally1 ");
		}

		System.out.println("main method ended ");
	}

}
