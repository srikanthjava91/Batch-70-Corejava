package com.fileio;

import java.io.File;

public class TestFileDemo4 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\srknt\\Downloads");

		File[] files = f.listFiles();
		int dirCount = 0;
		int fileCount = 0;
		int misCount = 0;

		for (File file : files) {

			if (file.isDirectory()) {
				dirCount++;
			} else if (file.isFile()) {
				fileCount++;
			} else {
				misCount++;
			}
		}
		
		System.out.println("Directory count : " + dirCount);
		System.out.println("File Count : " + fileCount);
		System.out.println("Additionals : " + misCount);

//		String[] names = f.list();
//		int count = 0;
//		
//		for(String name:names) {
//			System.out.println(name);
//			count++;
//		}

//		System.out.println("Count of the files : " + count);

	}

}
