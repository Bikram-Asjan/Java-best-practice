package com.map.howToIterate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HowToIterateMap {

	public static void main(String[] args) {
		// if we use LinkedhashMap then, insertion order will be preserved.
		// if we use normal HashMap then insertion order won't be preserved.
		
		//Map<String,Integer> hm = new LinkedHashMap<>();
		Map<String,Integer> hm = new HashMap<>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("four", 4);
		hm.put("five", 5);
		hm.put("three", 3);
		
		Set<String> hs = hm.keySet();
		List<String> list = new ArrayList<>(hs);
		Collections.sort(list,new MyComparator());
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			String key = itr.next();
			Integer value = hm.get(key);
			System.out.println("Key : "+key+"  value : "+value);
		}
		
	}

}
