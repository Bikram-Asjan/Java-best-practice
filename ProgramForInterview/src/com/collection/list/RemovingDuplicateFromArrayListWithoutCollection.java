package com.collection.list;

import java.util.ArrayList;

public class RemovingDuplicateFromArrayListWithoutCollection {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("love");
		al.add("You");
		al.add("mom");
		al.add("dad");
		al.add("love");
		System.out.println("without removing duplicate");
		System.out.println(al.size()); // 5
		al.forEach(System.out::println);
		System.out.println("After removing duplicate");
		for (int outer = 0; outer < al.size(); outer++) {
			for (int inner = outer + 1; inner < al.size(); inner++) {
				if(al.get(outer).equals(al.get(inner))){
					al.remove(inner);
					
				}
				//System.out.println("--------------");
				//al.forEach(System.out::println);
			}
		}
		al.forEach(System.out::println);
	}

}
