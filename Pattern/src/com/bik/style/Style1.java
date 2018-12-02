package com.bik.style;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Style1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many rows : ");
		int n = Integer.parseInt(br.readLine());
		// System.out.println(n);
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - k; j++) {
				System.out.print(n - j + "  ");
			}
			k++;
			System.out.println();
		}
		/*
		 * 5  4  3  2  1  
		   5  4  3  2  
           5  4  3  
           5  4  
           5  
		 */
		System.out.println("-----------------------");

		// 2nd pattern

		int r, c;
		for (r = 1; r <= n; r++) {
			for (c = 1; c <= n; c++)
				if (r > c)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			System.out.println();
		}
		System.out.println("-------------------------");
		// pattern 2 in another way

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (col < row) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println();
		}

		System.out.println("----------------------------");
		int s = n;
		for (int p = 1; p <= n; p++) {
			for (int q = 1; q <= n; q++) {
				if(q >= s){
					System.out.print("1 ");
				}else{
					System.out.print(" ");
				}
				
			}
			s--;
			
			System.out.println();
		}
		/*output:
			 1 
		    1 1 
		   1 1 1 
		  1 1 1 1 
		 1 1 1 1 1  
		*/
		System.out.println("------------------------");
		int d = n;
		for(int a = 1; a <= 5; a++){
			for(int b = 1; b<= 5; b++){
				if(b >= d){
					
					System.out.print(1);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			d--;
		}
		/*
		 *   1
   			 11
             111
             1111
             11111

		 */

	}

}
