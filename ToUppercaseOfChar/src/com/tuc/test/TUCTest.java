package com.tuc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TUCTest {

	public static void main(String[] args) throws IOException {

		//String s = "sunday is today";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence: ");
		String s = br.readLine();
		StringBuffer sb = new StringBuffer();
		String[] strArray = s.split(" ");
		
		for  (int i = strArray.length - 1; i >= 0; i--) {
			if (i == strArray.length - 1) {
				String s1 = strArray[strArray.length - 1];
				String s2 = s1.substring(1, s1.length());
			String s3 =	Character.toString(s1.charAt(0)).toUpperCase();
				sb.append(s3);
				sb.append(s2+" ");
			}else {
				sb.append(strArray[i] + " ");
			}

		}
		System.out.println(sb.toString());
		/*
		 * System.out.println((int)'A'); System.out.println((int)'a');
		 */

	}

}
