package com.collabera;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//FileReader is a class which is oriented toward reading text file and returning characters in byte format, similar to FileInputStream.
public class FileReaderDemo {
	
public static void main(String[] args) throws IOException {
	File fileObj = new File("hello.txt");
	//Create a new FileReader which will read from hello.txt
	FileReader fileReaderObj = new FileReader(fileObj);
	
	int i; 
	//While .read() method of FileReader doesn't equal -1, print out the next character.
	//Once the last character has been read, the next character will be equal to -1, indicating that the end of the file has been found.
    while((i=fileReaderObj.read())!=-1)    
    System.out.print((char)i);   
    //Have to close the FileReader when finished.
    fileReaderObj.close();
}

	

}
