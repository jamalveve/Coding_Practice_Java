package com.java.basic1;

import java.io.File;

public class SizeofTheFile {
	public static void main(String[] args) {
		System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
		System.out.println("/Coding_Practice_java/src/programPending.txt  : " + new File("programPending.txt").length()
				+ " bytes");

		// Specify the file path
//		String filePath = "src/programsPending.txt"; // Change this to your file path
		String filePath = "src/resource/Example.txt"; // Change this to your file path

		// Create a File object
		File file = new File(filePath);

		// Check if the file exists and is a file
		if (file.exists() && file.isFile()) {
			// Get the size of the file in bytes
			long fileSize = file.length();
			System.out.println("Size of the file: " + fileSize + " bytes");
            System.out.println("Absolute path of the file: " + file.getAbsolutePath());

		} else {
			System.out.println("The specified file does not exist or is not a file.");
		}
		
		
		
	}
}
