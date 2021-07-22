package com.java.string;

import java.util.Scanner;

public class PalindromeOfAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String sString = sc.nextLine();
		System.out.println("The string is a Palindrome  " + verifyStringIsAPalindrome(sString));
	}

	static boolean verifyStringIsAPalindrome(String sString) {
		String reverse = "";
		for (int i = sString.length() - 1; i >= 0; i--) {
			reverse += sString.charAt(i);
		}
		if (reverse.equals(sString))
			return true;
		else
			return false;
	}
}
