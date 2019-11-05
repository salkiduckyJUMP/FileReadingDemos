package com.collabera;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


//BufferedReader class can read the text file in a character-based input stream.
public class BufferedReaderDemo {
public static void main(String[] args) throws IOException {
	File fileObj = new File("hello.txt");
	//Create a new FileReader which will read from hello.txt
	FileReader fileReaderObj = new FileReader(fileObj);
	
	//Create a new BufferedReader which is handed the FileReader as an argument.
	BufferedReader bufferedReaderObj=new BufferedReader(fileReaderObj);    
	  
	//Read out the file using BufferedReader
    int i;    
    while((i=bufferedReaderObj.read())!=-1){  
    System.out.print((char)i);  
    }  
    
    //Close both Reader objects.
    bufferedReaderObj.close();    
    fileReaderObj.close();  
    
    //BufferedReader offers several other methods as well.
}
	
}
