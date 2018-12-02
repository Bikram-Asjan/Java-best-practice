package com.map.howToIterate;

import java.util.HashMap;

public class UsingEnhancedForEachLoopIn_Java8 {

	public static void main(String[] args) {
		HashMap<String, String> companyCEO = new HashMap<>();
		companyCEO.put("Google", "Sundar Pichai");
		companyCEO.put("FaceBook", "Mark Zuckerberg");
		companyCEO.put("Apple", "Steve Jobs");
		companyCEO.put("LinkedIn", "Reid Hoffman");
		companyCEO.put("Microsoft", "Bill Gates");
		
		// iterating using for-each loop in java 8 version
		companyCEO.forEach((key,value) -> System.out.println("org : "+key+"\t\t"+"value : "+value));
	}

}
