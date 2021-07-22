package com.java.Triangle;

import java.util.Scanner;

public class PrintRightAngleTriangle {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the base of triangle");
	int nextInt = sc.nextInt();
	for (int i = 0; i < nextInt; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
}
}
