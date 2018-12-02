package com.bik.style;

import java.util.Scanner;

public class Style5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n -i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*
	******
    *****
    ****
    ***
    **
    *
*/