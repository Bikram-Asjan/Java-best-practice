package com.bik.style;

import java.util.Scanner;

public class Style9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Put Odd Number Of Rows");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			// for printing space
			for (int x = (n + 1) / 2; x > i; x--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				for(int k = (((n+1)/2)+1); k<n; k++);
				{ 
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
