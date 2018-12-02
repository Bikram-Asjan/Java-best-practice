package com.sh.compare.compareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparisonUsing_compareTo {
	/**
	 * various ways to compare two string in java
	 * Using String class’s
         1. equals() method
         2. equalsIgnoreCase() method
         3. compareTo() method
         4. compateToIgnoreCase() method
            Using == operator
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Fist String : ");
		String first = br.readLine();
		System.out.println("Enter second String : ");
		String second = br.readLine();
		if (first.compareTo(second) == 0) {
			System.out.println("first String == second String");
		} else if (first.compareTo(second) > 0) {
			System.out.println("first String > second String");
		} else if (first.compareTo(second) < 0) {
			System.out.println("first String < second String");
		}
	}
}
