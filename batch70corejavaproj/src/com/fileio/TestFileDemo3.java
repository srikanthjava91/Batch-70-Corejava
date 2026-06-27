package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo3 {

	public static void main(String[] args) throws IOException {

		System.out.println("main method strated ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\sri");
		
		File f1 = new File(f, "Hello.txt");
		f1.createNewFile();
		
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		System.out.println(f.getAbsolutePath());//String 
		System.out.println(f.getAbsoluteFile());//File 
		System.out.println(f.getCanonicalPath());//String 
		System.out.println(f.getCanonicalFile());//File 
		
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());

//		boolean status = f.mkdir();
//
//		if (status) {
//			System.out.println("Directory has been created successfully !!");
//		} else {
//			System.out.println("Something went wrong !");
//		}

		System.out.println("main method ended ");

	}

}
