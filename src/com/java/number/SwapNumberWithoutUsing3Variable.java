package com.java.number;

import java.util.Scanner;

public class SwapNumberWithoutUsing3Variable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two values to be swapped");
		int firstValue = sc.nextInt();
		int secondValue = sc.nextInt();
		
		firstValue= firstValue+secondValue;
		secondValue=firstValue-secondValue;
		firstValue=firstValue-secondValue;
		System.out.println("After Swapped"+"\n"+firstValue+"\n"+secondValue);
	}
}
