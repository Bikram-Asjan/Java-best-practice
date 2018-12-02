package com.sh.reverse.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverseWithoutUsingPredefinedFunction {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any String and you will gfet reverse of that : ");
		String str = br.readLine();
		String reversedString = "";
		for (int i = 0; i < str.length(); i++) {
			reversedString = reversedString + str.substring(str.length()-1-i,str.length()-i);
			System.out.println(reversedString);
		}
		System.out.println("The original String : "+str);
		System.out.println("The reverse String : "+reversedString);
	}
}
