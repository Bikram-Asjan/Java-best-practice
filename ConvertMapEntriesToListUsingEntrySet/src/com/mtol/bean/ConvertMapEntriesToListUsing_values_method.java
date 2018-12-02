package com.mtol.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapEntriesToListUsing_values_method {

	public static void main(String[] args) {
		Map<Integer, String> dataMap = new HashMap<>();
		dataMap.put(1, "jada jada he");
		dataMap.put(2, "dharmascha");
		dataMap.put(3, "Glanir bhabati bharata");
		dataMap.put(4, "Abbhuthanam adharmascha");
		dataMap.put(5, "tadatmanam sricham jaham");
		for(Integer key : dataMap.keySet()){
			System.out.println(key+"  "+dataMap.get(key));
		}
		// list values 
		System.out.println("List values are : ");
		Collection<String> values = dataMap.values();
		List<String> listOfValues = new ArrayList<String>(values);
		for(String value : listOfValues){
			System.out.println(value);
		}
		
	}

}
