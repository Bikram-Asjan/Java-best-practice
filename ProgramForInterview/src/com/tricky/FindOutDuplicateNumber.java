						package com.tricky;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindOutDuplicateNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] intArray = new int[50];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("Enter the numbers to add into array : ");

		for (int i = 0; i < size; i++) {
			intArray[i] = sc.nextInt();
		}

		// in which position you want to insert the number into the array
		System.out.println("Enter the position where you want to insert the number : ");
		int position = sc.nextInt();

		// enter number which you want to insert
		System.out.println("Enter the number which you want to insert : ");
		int insert = sc.nextInt();

		// to create the space at the particular position
		for (int i = size; i > position; i--) {
			intArray[i] = intArray[i - 1];
		}
		intArray[position] = insert;

		System.out.println("Element inserted successfully : ");
		System.out.println("new Array is ");
		for (int i = 0; i <= size; i++) {
			System.out.println(intArray[i]);
		}

		// finding the duplicate elements using brute force method
		System.out.println("Finding duplicate Elements using brute force method ");
		for (int i = 0; i <= size; i++) {

			for (int j = i + 1; j <= size; j++) {
				if (intArray[i] == intArray[j]) {
					System.out.println("duplicate Element is : " + intArray[j]);
				}
			}

		}
		// using HashSet to find the duplicate
		HashSet<Integer> hs = new HashSet<>();
		for(int i : intArray){
			if(hs.add(i) == false){
				System.out.println("Duplicate Element is (using HashSet) :"+i);
				break;
			}
		}
	}

}
