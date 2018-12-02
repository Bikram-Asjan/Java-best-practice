package com.linkedlist.traverse;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTraverse {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Google");
		linkedList.add("Apple");
		linkedList.add("Paypal");
		linkedList.add("MicroSoft");

		// traversing using ListIterator
		System.out.println("traversing using ListIterator");
		ListIterator<String> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// traversing using traditional for loop
		System.out.println("Using traditional for loop");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		
		// traversing using for each loop
		System.out.println("using for each loop");
		for(String s : linkedList){
			System.out.println(s);
		}
		
		// traversing using java8 loop
		System.out.println("using java8 for each loop");
		linkedList.forEach(System.out::println);

	}

}
