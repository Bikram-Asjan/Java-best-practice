package com.bik.style;

import java.util.Scanner;

public class Style6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Rows: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for(int j = 1; j <= n; j++){
				if(j == n-i){
					System.out.print(0);
				}else{
					System.out.print(1);
				}
			}
			System.out.println();
		}
  }
}

/*
 11110
 11101
 11011
 10111
 01111 
 */
 