package com.array;

import java.util.Scanner;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] intArray = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int sizeOfArray = sc.nextInt();
		System.out.println("Enter the value to add into the array: ");

		for (int i = 0; i < sizeOfArray; i++) {
			intArray[i] = sc.nextInt();
		}
		System.out.println("Printing the value of Array with duplicate value: ");
		for(int value : intArray){
			System.out.println(value);
		}
		System.out.println("--------------------------");
		System.out.println("Printing the value of Array with out duplicate: ");
	
	}

}
