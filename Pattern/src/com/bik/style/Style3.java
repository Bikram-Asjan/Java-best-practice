package com.bik.style;

import java.util.Scanner;

public class Style3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows: ");
		int n = sc.nextInt();
		int v = 0;
		for (int i = 1; i <= n; i++) {
			// for column
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {

					v = (j % 2 == 0) ? 1 : 0;
					System.out.print(v);
				} else {
					v = (j % 2 == 0) ? 0 : 1;
					System.out.print(v);
				}
			}
			System.out.println();
		}
	}
}
/*
 * 1
   01
   101
   0101
 */

