package com.fibonacci.loopAndIteration;

import java.util.Scanner;

public class FibonacciSeriesWithIteration {
	private static int f1 = 1;
	private static int f2 = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int number = Integer.parseInt(sc.next());
		for (int i = 1; i <= number; i++) {
			if(i == 1){
				System.out.print("Fibonacci Series using Iteration : ");
			}
			System.out.print(fibonacci2(i) + " ");
			
		}
	}

	// using recursion
	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

	// using loop and iteration
	public static int fibonacci2(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		int fibonacci = 1;
		if (number > 2) {
			fibonacci = f1 + f2;
			f1 = f2;
			f2 = fibonacci;
		}

		return fibonacci;
	}
}
