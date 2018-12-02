package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MaximumOccurenceOfStringInCollection {

	public void maximumOccurence(Collection<String> c) {
		Map<String, Integer> map = new HashMap<>();
		int max = 0;
		for (String str : c) {
			if (map.containsKey(str)) {
				int i = map.get(str);
				map.put(str, i + 1);
			} else {
				map.put(str, 1);
			}
			if (map.get(str) > max) {
				max = map.get(str);
			}
		}
		for (String str1 : map.keySet()) {
			if (map.get(str1) == max) {
				System.out.println(str1);

			}
		}
		System.out.println(max);
		

	}


	public static void main(String[] args) {
		MaximumOccurenceOfStringInCollection m = new MaximumOccurenceOfStringInCollection();
		List<String> collec = new ArrayList();
		collec.add("bikram");
		collec.add("bikram");
		collec.add("sukanta");
		collec.add("rabindra");
		collec.add("sukanta");
		collec.add("sahid");
		collec.add("sahid");
		collec.add("sahid");
		collec.add("mmm");
		collec.add("mmm");
		//collec.add("mmm");
		m.maximumOccurence(collec);
	}
}
