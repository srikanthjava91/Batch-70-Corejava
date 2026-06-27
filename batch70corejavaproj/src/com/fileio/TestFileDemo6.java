package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFileDemo6 {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth.txt");
		BufferedReader br = new BufferedReader(fr);

		String st = br.readLine();

		while (st != null) {
			System.out.println(st);
			st = br.readLine();
			Thread.sleep(1000);
		}

		br.close();
		fr.close();

	}

}
