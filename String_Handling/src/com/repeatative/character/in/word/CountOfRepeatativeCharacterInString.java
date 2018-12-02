package com.repeatative.character.in.word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CountOfRepeatativeCharacterInString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any String : ");
		String str = br.readLine();
		char[] charArray = str.toCharArray();
		Map<Character, Integer> dataMap = new HashMap<Character, Integer>();
		int countValue = 0;
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (c != ' ') {
				if (dataMap.containsKey(c)) {
					countValue = dataMap.get(c) + 1;
					//System.out.println(countValue);
					dataMap.put(c, countValue);
				}else{
				dataMap.put(c, 1);
				}
			}
			
		}
		System.out.println(dataMap);
	}

}
