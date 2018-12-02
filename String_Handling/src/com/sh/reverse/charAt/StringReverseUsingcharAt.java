package com.sh.reverse.charAt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringReverseUsingcharAt {
	public static void main(String[] args) throws IOException {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter your string : "); String str = sc.next();
		 */
		/**
		 * if i use scanner then it will take only first word, after space it
		 * won't allow to take any word But when i use BufferedReader then if i
		 * pass a sentence also, it will take complete sentence as a String and
		 * reverse that String.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your string : ");
		String str = br.readLine();
		String reversedString = "";
		for (int i = 0; i < str.length(); i++) {
			reversedString = str.charAt(i) + reversedString;
			System.out.println(reversedString);
		}
		System.out.println("the original String is : " + str);
		System.out.println("the reversed String is : " + reversedString);
		System.out.println("    ");
		System.out.println("");
		String reversedString1 = "";
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String : ");
		String str1 = br.readLine();
		for (int index = str1.length()-1; index >= 0; index--) {
			reversedString1 = reversedString1 +  str1.charAt(index) ;
			System.out.println(reversedString1);
		}
		System.out.println("The original String : "+str1);
		System.out.println("The revresed String is : "+reversedString1);
	}

}
