package com.sfcwl.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesAndWordsInTextFile {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		int lineCount = 0;
		int wordCount = 0;
		String line ="";
		reader = new BufferedReader(new FileReader(new File("G:/internationalization.txt")));
		while((line = reader.readLine()) != null){
		 lineCount++;
		 String[] splits = line.split(" ");
		 wordCount = wordCount + splits.length;
		}
		System.out.println("No of lines : "+lineCount);
		System.out.println("No of words : "+wordCount);
		
	}

}
