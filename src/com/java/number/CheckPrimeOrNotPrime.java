package com.java.number;

import java.util.Scanner;

public class CheckPrimeOrNotPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int Number = sc.nextInt();
		System.out.println(Number + " is a prime number  :" + verifyNumberIsPrime(Number));
	}

	static boolean verifyNumberIsPrime(int Number) {
		int count = 0;
		for (int i = 2; i < Number; i++) {
			if (Number % i == 0) {
				count++;
			}
		}
		if (count == 0)
			return true;
		else
			return false;
	}
}
