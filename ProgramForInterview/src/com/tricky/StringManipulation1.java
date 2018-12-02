package com.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringManipulation1 {
	// find a word in an existing file, go the dictionary and check whether this
	// word is available or not.
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:  ");
		String str;
		try {
			str = br.readLine();
			char[] charArray = str.toCharArray();
			for (int i = 0; i < charArray.length; i++) {

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
