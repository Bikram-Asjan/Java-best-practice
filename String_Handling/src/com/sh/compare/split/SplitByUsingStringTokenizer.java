package com.sh.compare.split;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SplitByUsingStringTokenizer {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence : ");
		String sentence = br.readLine();
		StringTokenizer strTokenizer = new StringTokenizer(sentence);
		System.out.println("The number of tokens : "+strTokenizer.countTokens());
		while(strTokenizer.hasMoreTokens()){
			System.out.println(strTokenizer.nextToken());
		}
		
	}

}
