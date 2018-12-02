package com.tricky;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Put any number: ");
		int n = sc.nextInt();
		/**
		int f = 0;
		long fact = n;
		if (n == 0) {
			System.out.println("Factorial is 1");
		}
		while (n > 1) {
			f = n;
			fact = fact * (f - 1);
			n--;
		}
	**/
		BigInteger b1 = new BigInteger("1");

		for (int i = 1; i <= n; i++) {

			b1 = b1.multiply(new BigInteger(i + ""));
		}

		System.out.println("Factorial of the number :" + b1.toString());
	}

}
