package com.sh.reverse.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWithoutAlteringOrderOfSentence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence : ");
		String sentence = br.readLine();
		StringBuffer buffer = new StringBuffer();
		String[] splittedString = sentence.split(" ");
		for (int i = 0; i < splittedString.length; i++) {
			String reversedString = "";
			for(int index = splittedString[i].length()-1;index>=0;index--){
				reversedString = reversedString + splittedString[i].charAt(index);
			}
			buffer.append(reversedString).append(" ");
		}
		System.out.println("reverse String sentence : "+buffer.toString());
	}
}
