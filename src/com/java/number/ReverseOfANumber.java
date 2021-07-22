package com.java.number;

import java.util.Scanner;

public class ReverseOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("The reverse of a  "+number+" is : "+reverseANumber(number));
		sc.close();
	}
	
	static int reverseANumber(int number) {
		int i=0,j=0;
		while (number>0) {
			i=number%10;
			j=(j*10)+i;
			number= number/10;
		}
		return j;
	}

}
