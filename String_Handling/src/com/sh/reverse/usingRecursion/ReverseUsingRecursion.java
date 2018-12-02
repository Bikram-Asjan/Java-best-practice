package com.sh.reverse.usingRecursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseUsingRecursion {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string : ");
		String str = br.readLine();
		String reversedString = recursiveMethod(str);
		System.out.println(reversedString);
	}

	/**
	 * Recursion
	 * ----------
	 *  First time, when recursion() method is invoked, it checks for
	 *  empty string and if it satisfies this condition then empty string
	 *  returned (as there is nothing to be reversed)
	 *  Otherwise, last character from the passed string is extracted using substring() method of String class
	 *  Extracted last character is added to the new string variable using string concatenation (+ operator)
	 *  This is repeated until all characters of the string contents is invokes the recursion() method, resursively 
	 *  And finally when there is no more character left in the string content, then
	 *  all characters added to the already defined string variable in reverse
	 *  order using string concatenation is returned
	 */

	public static String recursiveMethod(String str) {
		if (str.length() == 0) {
			return "";
		}
		return str.substring(str.length() - 1) + recursiveMethod(str.substring(0, str.length() - 1));
	}
	/**
	 * substring(beginIndex,endIndex) method trakes string from begin index upto
	 * endIndex-1
	 * 
	 */
}
