package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConversionOfMapToList {

	public static <E> void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
				map.put(1, "Microsoft");
				map.put(2, "google");
				map.put(3, "Yahoo");
				map.put(4, "YouTube");
				map.put(5, "Facebook");
				map.put(6, "Gmail");
				System.out.println("using keyset method");
		Set<Integer> setOfkeys = map.keySet();
		List<Integer> list = new ArrayList<>(setOfkeys);
		list.forEach(System.out::println);
		System.out.println("--------------");
		System.out.println("using values method");
		Collection<String> collection = (Collection<String>) map.values();
		List<String> list1 = new ArrayList<>(collection);
		list1.forEach(System.out::println);
		System.out.println("Using entrySet");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		List<Entry<Integer, String>> list2 = new ArrayList<>(entrySet);
		list2.forEach(System.out::println);
		
	}

}
