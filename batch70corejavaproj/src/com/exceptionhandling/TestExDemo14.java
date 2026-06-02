package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo14 {

	public static void main(String[] args) throws IOException, ArithmeticException {
		System.out.println("main method started");

//		System.out.println(10 / 0);
		File f = new File("c:\\Users\\srknt\\Srikanth Java\\test1\\batch70_2.txt");

		boolean status = f.createNewFile();//// Unhandled exception type IOException

		if (status) {
			System.out.println("File has been created successfully !!");
		} else {
			System.out.println("Something went wrong ");
		}

		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");

	}

}
