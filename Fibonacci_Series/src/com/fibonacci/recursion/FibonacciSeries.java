package com.fibonacci.recursion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = Integer.parseInt(sc.next());
		for (int i = 1; i <= number; i++) {
			while (number >= 1 && i == 1) {
				System.out.println("fibonacci series of (" + number + ") : ");
				break;
			}
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}
