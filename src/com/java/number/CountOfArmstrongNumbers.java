package com.java.number;

import java.util.Scanner;

public class CountOfArmstrongNumbers {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The First Term");
		int firstTerm = sc.nextInt();
		System.out.println("Enter The Last Term");
		int lastTerm = sc.nextInt();
		System.out.println("Count of an ArmStrong Number :"+ getCountOfAArmStrongNumber(firstTerm,lastTerm));
	}
	static int getCountOfAArmStrongNumber(int firstNumber, int lastNumber){
		int count=0;
		for (int i = firstNumber; i <= lastNumber; i++) {
			int a =i,j,k=0;
			while (a>0) {
				j=a%10;
				k=(j*j*j)+k;
				a=a/10;
			}
			if (k==i) {
				count++;
			}
		}
		return count;
	}
	
}
