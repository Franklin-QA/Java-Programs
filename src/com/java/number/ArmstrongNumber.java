package com.java.number;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		System.out.println("The Number is a armstrong no  " + verifyArmstrongNumber(number));
	}

	static boolean verifyArmstrongNumber(int number) {
		int a = number, i = 0, j = 0;
		while (a > 0) {
			i = a % 10;
			j = (i * i * i) + j;
			a = a / 10;
		}
		if (j == number)
			return true;
		else
			return false;

	}
}
