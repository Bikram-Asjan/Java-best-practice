package com.mtol.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapEntriesToList {
  public static void main(String[] args) {
	  Map<Integer, String> dataMap = new HashMap<>();
	  dataMap.put(1, "divya");
	  dataMap.put(2, "anushka");
	  dataMap.put(3, "saheli");
	  dataMap.put(4, "sumi");
	  Set<Entry<Integer, String>> setOfEntries = dataMap.entrySet();
	  // Convert map entries to list using 
	  List<Entry<Integer, String>> listOfEntries = new ArrayList<>(setOfEntries);
	  for(Entry<Integer, String> entry : listOfEntries){
		  System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
	  }
  }
}
