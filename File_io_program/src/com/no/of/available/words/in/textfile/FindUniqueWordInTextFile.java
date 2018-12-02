package com.no.of.available.words.in.textfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindUniqueWordInTextFile {
	

	public static void main(String[] args) throws IOException {
		 Map<String, Integer> hm = new LinkedHashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new FileReader(new File("G:/normal.txt")));
		String str_line = br.readLine();
		String[] strArray = str_line.split(" ");
		for (String str : strArray) {
			
			if(str.endsWith(".") || str.endsWith(",")){
				 str = str.substring(0, str.length()-1);
			}
			if(hm.containsKey(str)){
				hm.put(str, hm.get(str)+1);
			}
			else{
				hm.put(str, 1);
			}
		}
		Set<Entry<String, Integer>> setOfEntry = hm.entrySet();
		for(Entry<String, Integer> e : setOfEntry){
			System.out.println(e.getKey()+"   "+e.getValue());
		}
		
		

	}

}
