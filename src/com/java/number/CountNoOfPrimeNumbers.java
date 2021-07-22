package com.java.number;


import java.util.Scanner;

public class CountNoOfPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter the last number");
		int lastNumber = sc.nextInt();
		System.out.println("The Total no of Prime number is : "+ getPrimeNoCount(firstNumber,lastNumber));
		sc.close();
	}
	
	static int getPrimeNoCount(int firstNumber,int lastNumber) {
		int totalCount=0;
		for (int i = firstNumber; i <= lastNumber; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==0) {
				totalCount++;
			}
		}
		return totalCount;
	}
}
