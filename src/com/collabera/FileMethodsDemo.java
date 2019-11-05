package com.collabera;

import java.io.File;

public class FileMethodsDemo {
	public static void main(String[] args) {

		// Create a file object that corresponds to an existing file in this root folder
		File fileObj = new File("hello.txt");
		
//		File fileObj = new File("goodbye.txt");
		
		//This method checks if your file object actually exists.
		if (fileObj.exists()) {
			System.out.println("The file is there.");
		} else {
			System.out.println("What is this, John Cena?");
		}
		//This method checks if your file object corresponds to an existing file.
		if (fileObj.isFile()) {
			System.out.println("Your file is made out of file.");
		} else {
			System.out.println("This isn't even a file.");
		}
		
		//hello.txt exists, so both will return the if case. 
		//If fileObj = goodbye.txt, a file that doesn't exist, the else cases will run.
	}

}
