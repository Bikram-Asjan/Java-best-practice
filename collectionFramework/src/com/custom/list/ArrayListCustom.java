package com.custom.list;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListCustom<E> extends ArrayList<E> {
	public boolean allowDuplicates;

	public ArrayListCustom(boolean allowDuplicates) {
		this.allowDuplicates = allowDuplicates;
	}

	HashSet<Object> myset = new HashSet<Object>();

	public boolean add(E e) {
		if (this.allowDuplicates == false && myset.add(e) == false) {
			throw new IllegalArgumentException("No duplicates are allowed");
		} else if (this.allowDuplicates == true && myset.add(e) == false) {
			super.add(e);
		}
		return allowDuplicates;
	}

	@Override
	public String toString() {
		return "ArrayListCustom [myset=" + myset + "]";
	}

	

}
