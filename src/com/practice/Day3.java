package com.practice;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Day3_1 d3 = new Day3_1();
		
		System.out.println("Enter 1st number :");
		int input1 = sc.nextInt();
		
		System.out.println("Enter 2nd number :");
		int input2 = sc.nextInt();
		
		int x = d3.getBiggest(input1,input2);
		System.out.println("the Biggest one is " + x );
		sc.close();
	}

}
