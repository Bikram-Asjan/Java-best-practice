package com.map.howToIterate;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class UsingEntrySetAndEnhancedForLoop {

	public static void main(String[] args) {
		HashMap<String, String> companyCEO = new HashMap<>();
		companyCEO.put("Google", "Sundar Pichai");
		companyCEO.put("FaceBook", "Mark Zuckerberg");
		companyCEO.put("Apple", "Steve Jobs");
		companyCEO.put("LinkedIn", "Reid Hoffman");
		companyCEO.put("Microsoft", "Bill Gates");
		
		Set<String> set = companyCEO.keySet();
		// iterating using entrySet() and using enhanced forEach() loop
		Set<Entry<String, String>> eset = companyCEO.entrySet();
		for(Entry<String, String> e1 : eset){
			System.out.println("org : "+e1.getKey()+"\t\t"+" Company : "+e1.getValue());
		}
		System.out.println("\n\n");
		set.forEach(s -> System.out.println("org : "+s+" CEO : "+companyCEO.get(s)));
		
		//Using java 8 forEach loop
		System.out.println("\n\n");
		System.out.println("iterating using forEach in java 8");
		companyCEO.forEach((key,value) -> System.out.println("org : "+key+"\t\t"+"value : "+value));
	}

}
