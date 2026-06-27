package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo7 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");
		FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth1.txt");

		fw.write(65);
		fw.write('\n');
		fw.write("Have a nice day ");
		fw.write('\n');
		fw.write("Files concepts are crazy ! ");
		fw.write('\n');

		fw.flush();
		fw.close();

	}
}
