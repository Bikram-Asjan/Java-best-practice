package com.dt.test;

public class MyFirstApp {

	public static void main(String[] args) {
		int x = 3, y = 13;
		if ((y < (x = x + x)) || (y < (x = x + x)) || (y < (x = x + x)) || 
				(y < (x = x + x)) || (y < (x = x + x))) {
			//System.out.println("(x = x + x) :"+(x = x + x));
			System.out.println(y - x);
		} else {
			System.out.println(y + x);
		}

	}

}

// Ans: -11