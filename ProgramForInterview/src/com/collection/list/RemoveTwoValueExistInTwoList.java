package com.collection.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RemoveTwoValueExistInTwoList {

	public static void main(String[] args) throws IOException {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Enter the value for fisrt List : ");
			String value = br.readLine();
			list1.add(value);
			System.out.println("Value " + value + " is added to the list");
			System.out.println("Do you want to add one more [yes/no]? : ");
			String option = br.readLine();
			if (option.equals("no")) {
				break;
			}
		}
		while (true) {
			System.out.println("Enter the value for second List : ");
			String value1 = br.readLine();
			list2.add(value1);
			System.out.println("Value " + value1 + " is added to the list");
			System.out.println("Do you want to add one more [yes/no]? : ");
			String option = br.readLine();
			if (option.equals("no")) {
				break;
			}
		}
		// print first list value
		System.out.println("First list values : ");
		for (String str1 : list1) {
			System.out.println(str1);
		}
		// print second list value
		System.out.println("Second list values : ");
		for (String str2 : list2) {
			System.out.println(str2);
		}
		String[] strArray = new String[16];
		int i = 0;
		// loop for finding the same value existed in both the list
		String[] strArray3 = new String[16];
		int k = 0;
		boolean flag1 = false;
		for (String s1 : list1) {
			for (String s2 : list2) {
				if (s1.equals(s2)) {
					System.out.println("Common value is : "+s1);
					strArray[i] = s1;
					flag1 = true;
					i++;
				}
			}
			if(flag1 == false){
				strArray3[k] = s1;
				k++;
			}
		}
		
		for(String str7 : strArray){
			for(String str8 : list2){
				if(list2.contains(str7)== false){
					strArray3[k] = str8;
				}
			}
		}
		
		// This loop for avoiding concurrent modification exception
		// loop for removing the same value existed in both the list
		for(String str3 : strArray){
			list1.remove(str3);
			list2.remove(str3);
		}
	
	}

}
