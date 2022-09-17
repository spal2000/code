package com.practice;

import java.util.Scanner;

public class Day5 {

	static String VAWEL = "aeiouAEIOU";

	public static void main(String[] args) {
		// AccessModifiers acc = new AccessModifiers();
		// acc.returnPublicName();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string ");
		String input = sc.next();
		String outPut = replaceVawelWithConsonentAndreplaceConsonentWithVawel(input);
		System.out.println(outPut);
		      
		sc.close();
	}
	
	static String replaceVawelWithConsonentAndreplaceConsonentWithVawel(String input){
		
		String outPut = "";
		for (char c : input.toCharArray()) {
			if (isInVowelsString(c)) {
				c = (char) (c + 1);
			}
			else {
				c = findNextVawel(c);
			}
			outPut = outPut + c;
		}
		return outPut;
	}

	static String replaceVawelWithConsonent(String input) {
		// TODO Auto-generated method stub
		String outPut = "";
		for (char c : input.toCharArray()) {
			if (isInVowelsString(c)) {
				c = (char) (c + 1);
			}
			outPut = outPut + c;
		}
		return outPut;
	}

	static String replaceConsonentWithVawel(String input) {
		String outPut = "";
		for (char c : input.toCharArray()) {
			if (!isInVowelsString(c)) {
				c = findNextVawel(c);
			}
			outPut = outPut + c;
		}
		return outPut;
	}

	static boolean isInVowelsString(char c) {
		return VAWEL.indexOf(c) != -1;
	}

	static char findNextVawel(char ch) {
		for(char c : VAWEL.toCharArray()) {
			if ((int)ch < (int)c) {
				return c;
			}
		}
		return ch;
		
	}

}
