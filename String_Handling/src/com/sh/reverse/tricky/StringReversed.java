package com.sh.reverse.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Reversing the complete sentence instead of single word. Here, complete
 * sentence is reversed as well as individual words
 * 
 * @author Bikram
 *
 */
public class StringReversed {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your sentence : ");
		String sentence = String.valueOf(br.read()).toCharArray().toString();
		System.out.println("sentence : "+sentence);
		String[] splittedString = sentence.split(" ");
		StringBuffer buffer = new StringBuffer();
		
		for (int i = splittedString.length - 1; i >= 0; i--) {
			
			for (int index = splittedString[i].length() - 1; index >= 0; index--) {
				String reversedString = "";
				reversedString = reversedString + splittedString[i].charAt(index);
				System.out.println(reversedString);
				buffer.append(reversedString);
			}
			buffer.append(" ");
			

		}
		System.out.println("the original sentence is : " + sentence);
		System.out.println("the reversed sentence is : " + buffer.toString());

	}
}
