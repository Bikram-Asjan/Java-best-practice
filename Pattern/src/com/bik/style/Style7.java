package com.bik.style;

import java.util.Scanner;

public class Style7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Rows: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1 | i==n | j==1 | j==n ){
					System.out.print("b ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
/*
b b b b b b 
b         b 
b         b 
b         b 
b         b 
b b b b b b 

 */
