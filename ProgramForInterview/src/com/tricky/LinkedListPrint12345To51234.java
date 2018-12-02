package com.tricky;

import java.util.LinkedList;

public class LinkedListPrint12345To51234 {

	public static void main(String[] args) {
		LinkedList link_list = new LinkedList<>();
		link_list.add(1);
		link_list.add(2);
		link_list.add(3);
		link_list.add(4);
		link_list.add(5);
		System.out.println(link_list.getLast());
		for (int i = link_list.size() - 2; i >= 0; i--) {
			System.out.println(link_list.get(i));
		}
	}

}
