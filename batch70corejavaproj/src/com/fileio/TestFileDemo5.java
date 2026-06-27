package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileDemo5 {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

		FileReader fr = new FileReader("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth.txt");

//		Reads a single character.
		int i = fr.read();// 71
		
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
			Thread.sleep(500);
		}

		fr.close();
	}

}
