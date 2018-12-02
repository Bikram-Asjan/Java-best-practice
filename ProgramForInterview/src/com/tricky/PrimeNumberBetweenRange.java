package com.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberBetweenRange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number : ");
		int number = Integer.parseInt(br.readLine());
		boolean flag = true;
		for (int i = 2; i <= number / 2; i++) {
			if(number % i == 0){
				flag = false;
				break;
			}
			
		}
		if(flag){
			System.out.println("The number "+ number + " is prime");
		}else{
			System.out.println("The number "+number+"  is not prime");
		}
	}

}
