package com.sh.reverse.toCharArray;

public class StringReverse {
	public static void main(String[] args) {
		/**
		 * ist way of reversing using toCharArray()
		 */

		String str = "i am a worst fellow";
		String reversedStr = "";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			reversedStr = reversedStr + str.charAt(i);
			System.out.println(reversedStr);
		}
		System.out.println("The original string is : " + str);
		System.out.println("The reverse string is : " + reversedStr);

		/**
		 * 2nd way of reversing using toCharArray()
		 */
		System.out.println("************Second way of iterating*********");
		String str1 = "i am worst fellow";
		String reversedStr1 = "";
		char[] ch1 = str1.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			reversedStr1 = str1.charAt(i) + reversedStr1;
			System.out.println(reversedStr1);
		}
		System.out.println("The original string is : " + str1);
		System.out.println("The reverse string is : " + reversedStr1);

		
	}
}
