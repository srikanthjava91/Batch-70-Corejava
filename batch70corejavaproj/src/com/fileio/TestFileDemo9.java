package com.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileDemo9 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main mstarted ");
		PrintWriter pw = new PrintWriter("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth2.txt");

		pw.println("Hello");
		pw.println(100);
		pw.println(55.5);
		pw.println(5.5);
		pw.println('C');
		pw.println(pw);

		pw.flush();
		pw.close();

	}

}
