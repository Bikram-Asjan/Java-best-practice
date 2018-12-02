package com.no.of.available.words.in.textfile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NoOfWordsAvailableIn_textFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("G:/Bikram/software_and_practice/Spring/buffalo.txt");
		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);

		Map<String, Integer> repeatative_Word_Count_Map = new HashMap<String, Integer>();

		String str = new String(b);
		String[] splittedWords = str.split(" ");
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		// counting words present in text file
		count = splittedWords.length;
		System.out.println(count);

		// taking dynamic input using BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your word : ");
		String word = br.readLine();
		String[] splits = null;
		String str1 = "";
		for (String s : splittedWords) {
			// System.out.println(s);
			if (s.endsWith(".") || s.endsWith(";") || s.endsWith(",")) {
				// System.out.println(s);
				str1 = s.substring(0, s.length() - 1);
				System.out.println("str1 : " + str1);
				if (str1.equals(word)) {
					count2++;

				}
				if(repeatative_Word_Count_Map.containsKey(str1) == false){
					repeatative_Word_Count_Map.put(str1, 1);
				}
				if (repeatative_Word_Count_Map.containsKey(str1)) {
					repeatative_Word_Count_Map.put(str1, repeatative_Word_Count_Map.get(str1) + 1);

				}

			} else if (s.equals(word)) {
				count2++;
				
			}else{
				if(repeatative_Word_Count_Map.containsKey(s) == false){
					repeatative_Word_Count_Map.put(s, 1);
				}
				if (repeatative_Word_Count_Map.containsKey(s)) {
					repeatative_Word_Count_Map.put(s, repeatative_Word_Count_Map.get(s) + 1);

				}
			}
			
			count1++;
		}
		System.out.println("No of worde present in Text file that you have given : " + count1);
		System.out.println(word + " presents " + count2 + " times");
		fis.close();
		System.out.println("Map : " + repeatative_Word_Count_Map);

	}

}
