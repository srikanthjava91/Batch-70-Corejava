package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo8 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("main method started ");
		FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(65);
		bw.write(66);
		bw.write("Chill ");
		bw.newLine();
		bw.write("Try to be Active ");
		bw.newLine();
		bw.write("Focus on Learning");
		bw.newLine();
		
		bw.flush();
		bw.close();
		fw.close();

	}

}
