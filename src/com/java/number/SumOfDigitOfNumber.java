package com.java.number;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int Number = sc.nextInt();
		System.out.println("Sum the digits of "+ Number+ " : "+getSumOfTheDigit(Number));
	}
	static int getSumOfTheDigit(int number) {
		int sum=0,i=0;
		while (number>0) {
			i=number%10;
			sum+=i;
			number=number/10;
		}
		return sum;
	}
}
