package com.java.Triangle;

import java.util.Scanner;

public class PrintTriangleWithNoRepeatingOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base no");
		int base = sc.nextInt();
		int a=0;
		for (int i = 0; i < base-1; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
}
