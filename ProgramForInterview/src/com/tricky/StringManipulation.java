package com.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringManipulation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence : ");
		String str = br.readLine();
		StringBuffer sb = new StringBuffer();
		String[] strArray = str.split(" ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			String s = strArray[i];
			char[] charArray = s.toCharArray();
			char c = charArray[0];
			String subString = Character.toString(c);
			String uppercaseOfsubString = subString.toUpperCase();
			String nextSubString = s.substring(1, s.length());
			sb.append(uppercaseOfsubString);
			sb.append(nextSubString);
			sb.append(" ");
			//break;
		}
		System.out.println(sb.toString());
	}

}
