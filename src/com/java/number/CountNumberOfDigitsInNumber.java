package com.java.number;

import java.util.Scanner;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int number = sc.nextInt();
		System.out.println("The count of the Number is : "+ countOfTheNumber(number));
	}
	static int countOfTheNumber(int number) {
		int i=0,count=0;
		while (number>0) {
			count++;
			number=number/10;
		}
		return count;
	}
}
