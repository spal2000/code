package com.practice;

public class ErrHandle {

	public static void main(String[] args) {
		int x;
		try {
			x = 5 / 0;
		}catch(Exception e) {
			System.out.print("Operation is not possible " + e.getMessage());
		}
		int y= 25/ 5;
		System.out.println("\n value " + y);
	}

}
