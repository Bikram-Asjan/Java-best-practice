package com.conversion.of.arrays.to.list;

import java.util.Arrays;
import java.util.List;

public class ConversionOfArraysToList {

	public static void main(String[] args) {
		String[] strArray = {"jada jada he","dharmascha","glanirbhabati bharata" };
		Integer[] intArray = {1,2,3};
		
		// for integer array
		List<Integer> IntegerList = Arrays.asList(intArray);
		for(int i : IntegerList){
			System.out.println(i);
		}
		// for string array
		List<String> stringList = Arrays.asList(strArray);
		for(String s : stringList){
			System.out.println(s);
		}
		
	}

}
