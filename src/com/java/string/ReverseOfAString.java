package com.java.string;

import java.util.Scanner;

public class ReverseOfAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String sString = sc.nextLine();
		System.out.println(reverse_of_A_String(sString));
	}

	static String reverse_of_A_String(String sString) {
		String reverse = "";
		for (int i = sString.length()-1; i >= 0; i--) {
			reverse += sString.charAt(i);
		}
		return reverse;
	}
}
