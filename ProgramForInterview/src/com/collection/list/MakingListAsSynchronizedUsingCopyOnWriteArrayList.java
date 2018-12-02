package com.collection.list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MakingListAsSynchronizedUsingCopyOnWriteArrayList {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cwal = new CopyOnWriteArrayList<String>();
		cwal.add("Subhas Chandra Bose");
		cwal.add("Swami Vivekananda");
		cwal.add("Rabindra Nath tagore");
		System.out.println("Displaying Synchronized ArrayList elements");
		// synchronized block is not required in this method
		Iterator<String> itr = cwal.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
