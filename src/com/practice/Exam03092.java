package com.practice;

import java.util.Scanner;

public class Exam03092 {
//Write a Java program to calculate the average value of array elements.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		double sum = 0;
		for(int i =0;i<len;i++) {
			sum = sum + arr[i];
		}
        double avg = sum /len;
        System.out.println("the average is " + avg);
	}

}
