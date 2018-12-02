package com.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		boolean flag = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any word to check palindrome : ");
		String word = br.readLine();
		char[] charArray = word.toCharArray();
		int j = charArray.length;
		for (int i = 0; i < charArray.length / 2; i++) {

			if (charArray[i] == charArray[j - 1]) {
				j--;
				flag = true;
				continue;
			}
			flag = false;
			break;
		}
		if(flag == true){
			System.out.println(word+ " is palindrome ");
		}else{
			System.out.println(word+" is not palindrome ");
		}
	}
}
