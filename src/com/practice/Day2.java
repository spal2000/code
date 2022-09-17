package com.practice;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// int sum=0;
		/*
		 * int i = 0; float f = 0; char c = 65; String d = null; String str = null;
		 * System.out.println("Default value of int is " + i);
		 * System.out.println("Default value of float is " + f);
		 * System.out.println("Default value of double is " + d);
		 * System.out.println("Default value of String is " + str);
		 * System.out.println("Default value of char is " + c);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int input = sc.nextInt();
		/*
		 * if (input>=50) { System.out.println(input + "is greater than 50");
		 * 
		 * } else { System.out.println(input + "is less than 50"); }
		 */
		/*
		 * if (input >= 100 ) { System.out.println(input + "is greater than 100");
		 * 
		 * } else if(input >=50){ System.out.println(input +
		 * "is greater than 50 and less than 100"); } else { System.out.println(input +
		 * "is less than 50");
		 * 
		 * }
		 */
		/*
		 * if(input>=90) { System.out.println("You got O"); } else if(input>=80) {
		 * System.out.println("You got E"); } else if(input>=70) {
		 * System.out.println("You got AA"); } else if(input>=60) {
		 * System.out.println("You got A+"); } else if(input>=50) {
		 * System.out.println("You got A"); } else if(input>=40) {
		 * System.out.println("You got B"); } else { System.out.println("You got C"); }
		 */

		/*
		 * for(int i=input;i>0;i--) { sum=sum +(i*i); }
		 * 
		 * System.out.println("Addition is " + sum);
		 */
		int fact = factUsingFor(input);

		System.out.println("Factorial is " + fact);

		sc.close();
	}

	public static int factUsingFor(final int input) {
		int result = 1;
		if(input <=0) {
			return 1;
		}
		for (int i = input; i > 0; i--) {
			result = result * i;
		}
		// System.out.println("factorial is " + result);

		return result;
	}

}
