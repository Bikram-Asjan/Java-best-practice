package com.hacker.hackerstring;

import java.util.Scanner;

import javax.swing.plaf.ComponentInputMapUIResource;

public class HackerString {
	private static String s = "hackerrank";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		char[] charArray1 = str.toCharArray();
		char[] charArray2 = str.toCharArray();
		StringBuffer bfr = new StringBuffer();
		int len = charArray1.length;
		int hack_len = charArray2.length;
		for (int i = 0; i < hack_len; i++) {
			Character hack_c1 = charArray1[i];
			for (int j = 0; j < len; j++) {
				Character c2 = charArray2[j];
				if(hack_c1 == c2){
					bfr.append(Character.toString(c2));
					System.out.println(bfr.toString());
					break;	
				}else{
					continue;
				}
			}
		}
	}

}
