package com.mtol.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvertMapKeysToListUsingKeySet {
	public static void main(String[] args) {
		Map<Integer, String> dataMap = new HashMap<Integer, String>();
		dataMap.put(1, "jada jada he");
		dataMap.put(2, "dharmascha");
		dataMap.put(3, "Glanirbhabati bharata");
		dataMap.put(4, "Abbhuthanam adharmascha");
		dataMap.put(5, "Tadatsmanam sricham jaham");
		System.out.println("all the keys and values of map : ");
		
		// getting all the keys using keySet() method
		Set<Integer> setOfKeys = dataMap.keySet();
		for(Integer key : setOfKeys){
			System.out.println(key+"  "+dataMap.get(key));
		}
		
		// convert into list
		List<Integer> list = new ArrayList<Integer>(setOfKeys);
		
		// iterate over the list and print values
		System.out.println("\n\n"+"The list values are : ");
		for(Integer i : list){
			System.out.println(i);
		}
		
		
		
	}
}
