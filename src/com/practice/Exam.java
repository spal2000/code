package com.practice;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			/*
			 * 1. Write a program to swap two numbers in Java. Numbers should be taken as
			 * input. Example : Input : x = 10 , y = 15 ; x = 5 , y = 30 Output : x = 15 , y
			 * = 10 ; x = 30 , y = 5
			 */
			// swapTwoNumbers(sc);

			/*
			 * 2. Write a program to print the nth element of the Fibonacci series.f(n) =
			 * f(n-1)+f(n-2); n should betaken as input. f(0)=0 ; f(1) = 1. Example :
			 * Input(n) : 3 ; 6 Output(f(n)) : 2 ; 8
			 */
			// System.out.println(fibonacciNumber(sc));

			/*
			 * 3. Check if a given number is a palindrome or not. A palindrome is a type of
			 * number where if you reverse the same number it will be equal to the previous
			 * number; Input should be taken from the console. Example: Input : 12321 ;
			 * 12320 Output : true ; false
			 */
			 // System.out.println(isPalindrome(sc));

			/*
			 * 4. Write a program to find the sum of n natural numbers. n should be taken as
			 * input. Example : Input : 5 ; 8 Output : 15 ; 36
			 */
			// System.out.println(sumOfNaturalNumber(sc));

			/*
			 * 5. Calculate the sum of digits of a given number. Number should be taken as
			 * input. Example : Input : 15 ; 153 Output : 6 ; 9
			 */
			 System.out.println(calculateSumOfDigites(sc));

			/*
			 * 6. Find the second-highest number in an array. The array should be taken as
			 * input. Example : Input : {1,2,5,7,6} ; {5,8,6,10,15} Output : 6 ; 10
			 */
			 System.out.println(secondHighestNumber(sc));

			/*
			 * 7. Find the second lowest number in an array. The array should be taken as
			 * input. Example : Input : {1,2,5,7,6} ; {5,8,6,10,15} Output : 2 ; 6
			 */
			// System.out.println(secondLowestNumber(sc));

			/*
			 * 8. Write a code to print all the first n prime numbers where n will be given
			 * as input. Example : Input : 5 ; 3 Output : 1,2,3,5,7 ; 1,2,3
			 */
			// System.out.println(printAllPrimeNumbers(sc));

			/*
			 * 9. Write a program to get the sum of even numbers in an array. Example :
			 * Input : {1,3,5,7,9} ; {1,2,3,4} Output : 0 ; 6
			 */
			// System.out.println(sumOfEvenNumbers(sc));

			/*
			 * 10. Write a program to get the sum of odd numbers in an array. Example :
			 * Input : {2,4,6,8,10} ; {1,2,3,4} Output : 0 ; 4
			 */
			 System.out.println(sumOfOddNumbers(sc));

			sc.close();

		

	}
	protected static int sumOfOddNumbers(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter length of array : ");
		int len = sc.nextInt();
		System.out.println("Enter numbers : ");
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int n = sc.nextInt();
			if (n % 2 != 0) {
				sum = sum + n;
			}
		}
		return sum;
	}

	protected static int sumOfEvenNumbers(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter length of array : ");
		int len = sc.nextInt();
		System.out.println("Enter numbers : ");
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int n = sc.nextInt();
			if (n % 2 == 0) {
				sum = sum + n;
			}
		}
		return sum;
	}

	// private static char[] printAllPrimeNumbers(Scanner sc) {
	// // TODO Auto-generated method stub
	// System.out.print("Enter the number : ");
	// int number = sc.nextInt();
	// int count = 0;
	// int[] prime = new int[number];
	// while(count!=number) {
	//
	// }
	//
	//
	//
	// return null;
	// }

	protected static int secondLowestNumber(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter length of array : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter numbers : ");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[1];

	}

	protected static int secondHighestNumber(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter length of array : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter numbers : ");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[len - 2];

	}

	private static int calculateSumOfDigites(Scanner sc) {
		// TODO Auto-generated method stub
		int result = 0;
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		while (number != 0) {
			result = result + number % 10;
			number = number / 10;
		}

		return result;

	}

	protected static int sumOfNaturalNumber(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	protected static boolean isPalindrome(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		String str = number + "";
		boolean result = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				result = false;
				break;
			}
		}
		return result;

	}

	protected static int fibonacciNumber(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		return fib(n);

	}

	protected static int fib(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}

	}

	protected static void swapTwoNumbers(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter 1st number n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number n2 : ");
		int n2 = sc.nextInt();

		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;

		System.out.print("n1 : " + n1 + " n2 :" + n2);
	}
}
