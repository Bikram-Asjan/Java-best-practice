package com.no.of.available.words.in.textfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class Read_The_File {
	public static void main(String[] args)throws IOException {
		Scanner sc = null;
		// one way, scanner can read first 1024 bytes from the file
		File file = new File("G:/normal.txt");
		try {
			 sc = new Scanner(file);
			//
			sc.useDelimiter("\\Z"); 
			System.out.println(sc.next());
		} catch (IOException e) {

		}finally{
			if(sc != null)
			sc.close();
			
		}
		// another way for Java 7
		
		List<String> lines = Files.readAllLines(Paths.get("G:/normal.txt"), StandardCharsets.UTF_8);
		lines.forEach(System.out::println);
		
		// using FileInputStream
		FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int)file.length()];
		fis.read(byteArray);
		String str = new String(byteArray, StandardCharsets.UTF_8);
		System.out.println(str);
		

	}
}
