package com.practice;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		long input = sc.nextLong();
		if (input < 0)
			input = input * (-1);
		// long result = power(input);
		System.out.println("Result is " + power(input));
		sc.close();
	}

	public static long power(final long input) {
		long pow = 1;
		for (long i = input; i > 0; i--) {
			pow = pow * 2;
		}
		return pow;
	}
}
