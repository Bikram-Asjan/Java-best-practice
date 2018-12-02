package com.tricky;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TakeStringFromUserAndStoreInArrayListAndPrintRepeatatedletter {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		for (String s : strArray) {
			char[] charArray = s.toCharArray();
			for (char c : charArray) {
				
				if (map.containsKey(c)) {
					int value = map.get(c);
					map.put(c, value + 1);
					
				}else{
				
				map.put(c, 1);
				}
			}
		}
		Set<Character> hs = map.keySet();
		for (char c : hs) {
			System.out.println("key : " + c + "   " + "count : " + map.get(c));
		}

	}

}
