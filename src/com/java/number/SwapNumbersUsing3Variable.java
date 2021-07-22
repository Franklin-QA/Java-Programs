package com.java.number;

import java.util.Scanner;

public class SwapNumbersUsing3Variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to swap");
		int firstnumber = sc.nextInt();
		int secondNumber=sc.nextInt();
		
		/*
		 * swapping with third variable 
		 */
		int c=firstnumber;
		firstnumber=secondNumber;
		secondNumber=c;
		System.out.println("After Swapped"+"\n"+firstnumber+"\n"+secondNumber);
	}
	
}
