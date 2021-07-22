package com.java.OddEven;

import java.util.Scanner;

public class CountOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Term");
		int startNumber = sc.nextInt();
		System.out.println("Enter the Last Term");
		int LastNumber = sc.nextInt();
		int countOfEvenNumber = countOfEvenNumber(startNumber, LastNumber);
		System.out.println(countOfEvenNumber);

	}

	static int countOfEvenNumber(int first_term, int last_Term) {
		int count = 0;
		for (int i = first_term; i <= last_Term; i++) {
			if (i%2==0) {
				count++;
			}
		}
		return count;
	}
}
