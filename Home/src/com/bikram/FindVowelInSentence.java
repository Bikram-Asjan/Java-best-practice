package com.bikram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindVowelInSentence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		Map<String, List<Character>> hm = null;
		 

		
		hm = new LinkedHashMap<>();
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence: ");
		String sentence = br.readLine();
		String[] strArray = sentence.split(" ");
		for (String str : strArray) {

			char[] charArray = str.toCharArray();
			List<Character> listOfVowel = new ArrayList<>();
			for (Character c : charArray) {
				String str1 = c.toString();
				if (str1.equalsIgnoreCase("a") || str1.equalsIgnoreCase("e") || str1.equalsIgnoreCase("i")
						|| str1.equalsIgnoreCase("o") || str1.equalsIgnoreCase("u")) {
					listOfVowel.add(c);
				}
				hm.put(str, listOfVowel);
			}
		}
			// for printing purpose
		     Set<Entry<String, List<Character>>> entrySet = hm.entrySet();
		     for(Entry<String, List<Character>> e : entrySet){
		    	 System.out.println("word is : "+e.getKey());
		    	 List<Character> listOfCharacter = e.getValue();
		    	 if(listOfCharacter.isEmpty()) {
		    		 System.out.println("No Vowel");
		    	 }else{
		    		 //System.out.println("Vowels are : ");
		    	 listOfCharacter.forEach(System.out::println);
		    	 }
		     }
			
		}
	}


