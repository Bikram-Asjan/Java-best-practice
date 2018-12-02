package com.sfcwl.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CountRepeataiveWordInTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = null;
		String fileName = "G:/internationalization.txt";
		br = new BufferedReader(new FileReader(new File(fileName)));
	}

}
