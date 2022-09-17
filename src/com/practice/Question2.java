package com.practice;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int input = sc.nextInt();
		if (input < 0)
			input = input * (-1);
		int result = sumofseries(input);
		System.out.println("Addition is " + result);
		sc.close();
	}

	public static int sumofseries(final int input) {
		int sum = 0;
		for (int i = input; i > 0; i--) {
			sum = sum + (i * i);
		}
		return sum;
	}
}
