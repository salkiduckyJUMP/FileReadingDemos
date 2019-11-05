package com.collabera;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class ReverseFileDemo {
	public static void main(String[] args) throws IOException {
		File fileObj = new File("hello.txt");
		//Create a new FileReader which will read from hello.txt
		FileReader fileReaderObj = new FileReader(fileObj);
		
		//Create a new BufferedReader which is handed the FileReader as an argument.
		BufferedReader bufferedReaderObj=new BufferedReader(fileReaderObj);    
			 
		//Declare an ArrayList
		 ArrayList list = new ArrayList();
	      String line;
	      //Using the readLine() method--which returns null when there is no next line, indicating the end of the file was reached.
	      //While there is a next line to be read in the file...
	      while ((line = bufferedReaderObj.readLine()) != null) {
	    	//save each line of the file to the ArrayList
	        list.add(line);
	      }
	      bufferedReaderObj.close();
	      fileReaderObj.close();  

	      //The array now has our file's contents in it as elements.
	      System.out.println(list);
	      
	      //Use the reverse() method of Collections on the ArrayList of lines from the file
	      Collections.reverse(list);
	      
	      //Print out the reversed contents in an array form.
	      System.out.println(list);    
		
	}
}
