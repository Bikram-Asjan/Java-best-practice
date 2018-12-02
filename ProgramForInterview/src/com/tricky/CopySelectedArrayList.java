package com.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CopySelectedArrayList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> list1 = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			list1.add(i);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the min limit : ");
		int minLimit = Integer.parseInt(br.readLine());
		System.out.println("Enter the max limit : ");
		int maxLimit = Integer.parseInt(br.readLine());
		List<Integer> list2 = new ArrayList<>();
		for (int value : list1) {
			if (value >= minLimit && value < maxLimit) {
				list2.add(value);
			}
		}
		for(int i : list2){
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		System.out.println("Iteration using Java 8 for loop, lambda expression: ");
		list2.forEach(System.out::println);
	}
	
}
