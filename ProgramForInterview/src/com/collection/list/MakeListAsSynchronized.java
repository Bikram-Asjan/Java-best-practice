package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MakeListAsSynchronized {

	public static void main(String[] args) {
		List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
		syncList.add("pen");
		syncList.add("book");
		syncList.add("pencil");
		System.out.println("Iterating synchronized ArrayList:");
		synchronized (syncList) {
			Iterator<String> itr = syncList.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}
	}

}
