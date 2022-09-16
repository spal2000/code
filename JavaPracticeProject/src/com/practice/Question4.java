package com.practice;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int k = sc.nextInt();
		if (k < 0)
			k = k * (-1);
		int result = factorial(k);
		System.out.println("Factorial of " + k + " is " + result);
		sc.close();
	}

	public static int factorial(final int k) {
		if (k <= 0) {
			return 1;
		} else {
			return k * factorial(k - 1);
		}
	}
}