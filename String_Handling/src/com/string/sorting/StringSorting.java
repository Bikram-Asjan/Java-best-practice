package com.string.sorting;

import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("put any string");
		String str = sc.next();
		char[] charArray1 = str.toCharArray();
		char[] charArray2 = new char[charArray1.length];
		
		System.out.println();
		//int count = 0;
		for (int i = 0; i < charArray1.length; i++) {
			int count = 0;
			for (int j = 0; j < charArray2.length; i++) {
				if (charArray1[i] < charArray1[j]) {
					count++;
				}
			}
			charArray2[count] = charArray1[i];
		}
		System.out.println("sorting string is: ");
		for(char c : charArray1){
			System.out.print(c+"  ");
		}
		
	}

}
