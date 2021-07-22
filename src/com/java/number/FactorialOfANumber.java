package com.java.number;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		System.out.println("factorial of the "+number+" : "+getFactorialOfTheNumber(number));
	}
	
	static int getFactorialOfTheNumber(int number){
		int factorial=1;
		for (int i = 1; i <=number; i++) {
			factorial=factorial*i;
		}
		
		return factorial;
	}
}
