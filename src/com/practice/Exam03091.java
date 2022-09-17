package com.practice;

import java.util.Scanner;

public class Exam03091 {
//Write a Java program to find the duplicate values of an array of integer values.
// Write a Java program to find the common elements between two arrays of integers.

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System .in);
	 
	 System.out.println("Enter the length of first array");
	    int len1 = sc.nextInt();
	    System.out.println("Enter the length of second array");
	    int len2 = sc.nextInt();
	    int[] arr = new int[len1];
		int[] arr1 = new int[len2];
		System.out.println("Enter the value in the first array");
		for (int i = 0; i < len1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value in the second array");
		for (int i = 0; i < len2; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < len1; i++) 
		{
			for (int j = i + 1; j < len1; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break ;
				}
				
			}
		}
		for (int i = 0; i < len1; i++) 
		{
			for (int j = 0; j < len2; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println(arr[i]);
					arr1[j]=-99;
					break;
				}
				
			}
		}

	}

}
