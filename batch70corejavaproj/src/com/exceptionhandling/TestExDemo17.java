package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo17 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");
		hello();
		System.out.println("main method ended ");

	}

	static void hello() throws IOException {
		System.out.println("Hello method called ");
		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\Hi.txt");

		f.createNewFile();
		System.out.println("Hello method ended ");
	}

}
