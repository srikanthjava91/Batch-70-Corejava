package com.exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestExDemo15 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("main method started ");

		File f = new File("c:\\Users\\srknt\\Srikanth Java\\test1\\batch70_2.txt");
		try (FileReader fr = new FileReader(f)) { //// Unhandled exception type FileNotFoundException

			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
				Thread.sleep(500);
			}
		}

		System.out.println("main method ended ");

	}

}
