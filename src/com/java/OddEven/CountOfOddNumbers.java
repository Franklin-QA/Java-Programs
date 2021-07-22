package com.java.OddEven;

import java.util.Scanner;

public class CountOfOddNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first Term");
	int firstTerm = sc.nextInt();
	System.out.println("Enter the last Term");
	int lastTerm = sc.nextInt();
	int countOfOddNumber = countOfOddNumber(firstTerm,lastTerm);
	System.out.println(countOfOddNumber);
}

static int countOfOddNumber(int firstTerm,int lastterm){
	int count=0;
	for (int i = firstTerm; i < lastterm+1; i++) {
		if (i%2!=0) {
			count++;
		}
	}
	return count;
}
}
