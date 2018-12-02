package com.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DetermineMinAndMaxDigit {

	public static void main(String[] args) throws IOException {
		long max_digit = 0;
		
		long digit = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number : ");
		// int number = Integer.parseInt(br.readLine());
		long number = Integer.valueOf(br.readLine());
		long min_digit = number % 10;
		System.out.println(number);
		while (number > 0) {
			digit = number % 10;
			if (digit > max_digit) {
				max_digit = digit;
			}

			if (min_digit > digit) {
				min_digit = digit;
			}

			number = number / 10;
		}
		System.out.println("Max digit in the number is : " + max_digit);
		System.out.println("Min digit in the number is : " + min_digit);

	}

}
