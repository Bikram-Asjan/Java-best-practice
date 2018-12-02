package com.bik.style;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Style2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Rows : ");
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {

			// for space printing
			for (int x = n - i; x >= 1; x--) {
				System.out.print(" ");
			}
			// for column
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// for extra part
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();

		}
	}

}

/*
     	1
       121
      12321
     1234321
*/