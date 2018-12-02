package com.collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDulicateFromList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("A");
		list.add("c");
		list.add("d");
		list.add("c");
		list.add("e");
		// USing Set
		Set<String> hs = new HashSet<>(list);
		// hs.forEach(System.out::println);
		System.out.println("After removing the duplicate");
		List<String> newList = new ArrayList<>(hs);
		newList.forEach(System.out::println);
	
		

	}

}
