package com.bik.style;

import java.util.Scanner;

public class Style8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Put the String : ");
		String str = sc.next();
		int len = str.length();
		char[] charArray = str.toCharArray();
		
		for (int i = 1; i <= len; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(charArray[j]);
			}
			System.out.println();
		}
	}

}
/*
B
BI
BIS
BISW
BISWA
BISWAJ
BISWAJI
BISWAJIT 
 */
