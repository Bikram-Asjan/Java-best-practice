package com.conversion.of.arrays.to.list;

import java.util.ArrayList;
import java.util.List;

public class ConversionOfListIntoArrays {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("asoke");
		list.add("jayanti");
		list.add("tithi");
		list.add("they are my familiy");
		Object[] arrayFromList = (Object[])list.toArray();
		for(int i =0;i<arrayFromList.length;i++){
			System.out.println(arrayFromList[i]);
		}
		
	}

}
