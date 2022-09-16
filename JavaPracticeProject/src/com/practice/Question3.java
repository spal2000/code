package com.practice;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int i = sc.nextInt();
		if (i < 0)
			i = i * (-1);
		int result = sumofseries(i);
		System.out.println("Addition is " + result);
		sc.close();
	}

	public static int sumofseries(final int i) {
		if (i > 0) {
			return (i * i) + sumofseries(i - 1);
		} else {
			return 0;
		}
	}
}