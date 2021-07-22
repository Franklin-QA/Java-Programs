package com.java.OddEven;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Term");
		int firstTerm = sc.nextInt();
		System.out.println("Enter the last Term");
		int lastTerm = sc.nextInt();
		int sumOfOddNumber = sumOfOddNumber(firstTerm,lastTerm);
		System.out.println(sumOfOddNumber);
	}
	static int sumOfOddNumber(int a , int b) {
		int sum=0;
		for (int i = a; i <=b; i++) {
			if (i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}

}
