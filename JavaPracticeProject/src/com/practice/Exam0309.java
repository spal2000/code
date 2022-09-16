package com.practice;

import java.util.Scanner;

public class Exam0309 {

	public static void main(String[] args) {
//Write a Java program to get the character at the given index within the String
//Write a Java program to concatenate a given string to the end of another string.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String s = sc.nextLine();
		System.out.println("Enter the second String ");
		String str = sc.nextLine();
		System.out.println("Enter the string which you could find");
		String a= sc.next();
		int out = s.indexOf(a);
		System.out.println("the index value of given string is " + out);
		System.out.println(s+str);
		sc.close();
	}

}
