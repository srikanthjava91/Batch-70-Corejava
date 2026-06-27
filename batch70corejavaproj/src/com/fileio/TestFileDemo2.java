package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth1.doc");
//		f.delete();

		boolean isExist = f.exists();

		if (!isExist) {
			f.createNewFile();
			System.out.println("File has been created successfully !");
		} else {
			System.out.println("The File is already available !");
		}

		System.out.println("main method ended ");

	}

}
