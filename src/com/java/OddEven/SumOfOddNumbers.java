package com.java.OddEven;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Term");
		int firstTerm = sc.nextInt();
		System.out.println("Enter the Last Term");
		int lastTerm = sc.nextInt();
		System.out.println(sumOfOddNumber(firstTerm,lastTerm));
		sc.close();
		
	}
	static int sumOfOddNumber(int first_number,int last_Number) {
		int sum=0;
		for (int i = first_number; i <= last_Number; i++) {
			if (i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}

}
