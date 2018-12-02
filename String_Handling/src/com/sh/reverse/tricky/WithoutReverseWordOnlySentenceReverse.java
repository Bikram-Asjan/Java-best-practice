package com.sh.reverse.tricky;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithoutReverseWordOnlySentenceReverse {
	public static void main(String[] args) throws IOException {
		
		FileInputStream inputStream = new FileInputStream(new File("G:/Bikram/software_and_practice/Spring/rocket.properties"));
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		// String sentence = br.readLine();
		StringBuilder builder = new StringBuilder();
		/*System.out.println("\n monkey \n Samaresh Donkey");*/
		int j = 0;
		while ((j = br.read()) != -1) {
			builder.append((char) j);
			System.out.println(j);
		}
		
		
		System.out.println("..............");
		String sentence = builder.toString();
		// System.out.println("The sentence is "+sentence);
		StringBuffer buffer = new StringBuffer();
		String[] splittedString = sentence.split(" ");
		for (int i = splittedString.length - 1; i >= 0; i--) {
			buffer.append(splittedString[i]).append(" ");
		}
		System.out.println(buffer.toString());
	}
}
