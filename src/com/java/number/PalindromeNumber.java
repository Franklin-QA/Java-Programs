package com.java.number;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("The "+number+" is a Palindrome : "+verifyNoIsPalindrome(number));
		sc.close();
	}

	static boolean verifyNoIsPalindrome(int number) {
		int a = number, i = 0, j = 0;
		while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
		}
		if (number == j)
			return true;
		else
			return false;
	}
}
