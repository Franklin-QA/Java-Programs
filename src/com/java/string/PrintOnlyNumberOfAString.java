package com.java.string;

import java.util.Scanner;

public class PrintOnlyNumberOfAString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String sString = sc.nextLine();
		System.out.println("the Numbers Present in the given String are : "+getNumbersFromString(sString));
	}
	
	static String getNumbersFromString(String string){
		char[] ch = string.toCharArray();
		String numbers="";
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				numbers+=ch[i];
			}
		}
		return numbers;
	}
}
