package com.java.string;

import java.util.Scanner;

public class ReverseEachWordOfAString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String sString = sc.nextLine();
		System.out.println(reverseEachWordOfTheString(sString));
	}
	
	static String reverseEachWordOfTheString(String sString) {
		String[] split = sString.split(" ");
		String reverse="";
		for (int i = 0; i < split.length; i++) {
			for (int j = split[i].length()-1; j >=0 ; j--) {
				reverse+=split[i].charAt(j);
			}
			reverse+=" ";
		}
		return reverse.trim();
	}

}
