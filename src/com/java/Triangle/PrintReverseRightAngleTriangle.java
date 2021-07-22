package com.java.Triangle;

import java.util.Scanner;

public class PrintReverseRightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base length of a Triangle");
		int base = sc.nextInt();
		for (int i = 0; i < base; i++) {
			for (int j = base-1 ; j >=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
