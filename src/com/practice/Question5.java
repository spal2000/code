package com.practice;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println("Factorial of " + num + " is " + result);
		sc.close();
	}

	public static int factorial(final int num) {
		int i = 1;
		int fact = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		return fact;
	}
}
