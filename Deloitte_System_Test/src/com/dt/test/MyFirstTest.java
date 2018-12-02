package com.dt.test;

public class MyFirstTest {

	public static void main(String[] args) {
		int x = 5;
//		for (int i = 1; i < 10; ++i) {
			//System.out.println(x);
			for (int j = 1; j < 11; j++) {
				System.out.println(" j : "+j);

				for (int k = 1; k < 12; ++k) {
					System.out.println(" k : "+k);
					x = x + 1;
					System.out.println(x);
				}
			}
//		}

		System.out.println(x);
	}

}
