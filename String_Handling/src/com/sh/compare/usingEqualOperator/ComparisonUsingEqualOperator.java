package com.sh.compare.usingEqualOperator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparisonUsingEqualOperator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first String : ");
		String str1 = br.readLine();
		System.out.println("Enter second String : ");
		String str2 = br.readLine();
		String str3 = new String(str2);
		System.out.println("== operator compare the references rather original string contents");
		System.out.println("......................");
		if ((str1 == str2) == false) {
			System.out.println("when 2 string objects is compared, then it returns false as every individual objects is"
					+ " stored separately in heap memory even if the string contents is exactly same");
		}
		if ((str1 == str3) == false) {
			System.out.println("when 2 string objects is compared, then it returns false as every "
					+ "individual objects is stored separately in heap memory even if the string contents is "
					+ "exactly same");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		// only string comparison

		String s4 = "technology";
		String s5 = "technology";
		String s6 = new String(s5);
		if (s4 == s5) {
			System.out.println("When we define 2 string literal and compare using == operator, then it return "
					+ "true because of String pool concept");
		} else if (s4 == s6) {
			System.out.println("when 2 string objects is compared, then it returns false as every individual "
					+ "objects is stored separately in heap memory even if the string contents" + " is exactly same");
		}

	}
}
/**
 * Java starter tends to use == operator for string comparison. Actually, it
 * does comparison but their reference address not with their original contents
 * 
 * == operator compare the references rather original string contents When we
 * define 2 string literal and compare using == operator, then it return true
 * because of String pool concept But when 2 string objects is compared, then it
 * returns false as every individual objects is stored separately in heap memory
 * even if the string contents is exactly same
 */
