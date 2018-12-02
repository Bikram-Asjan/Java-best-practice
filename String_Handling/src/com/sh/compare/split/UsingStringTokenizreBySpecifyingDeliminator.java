package com.sh.compare.split;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UsingStringTokenizreBySpecifyingDeliminator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence : ");
		String sentence = br.readLine();
		String[] strArray = new String[16];
	
		StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
		System.out.println("The number of tokens : " + tokenizer.countTokens());
		int count = 0;
		while (tokenizer.hasMoreTokens()) {
			// System.out.println(tokenizer.nextToken());
			 for(int i = 0; i < tokenizer.countTokens(); i++) {
				strArray[i] = tokenizer.nextToken();
				System.out.println(strArray[i]);
				count++;
			}
		}
				System.out.println(count);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(strArray[i]);
			count++;
		}
		//System.out.println(count);
		String[] strArray2 = sentence.split(" ");
		for(String str : strArray2){
			System.out.println(str);
		}
	}
}
