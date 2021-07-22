package com.java.string;

import java.util.Scanner;

public class RemoveSpace_SplitAndReverseOfAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String sString = sc.nextLine();
		System.out.println(remove_Space_Split_And_Reverse_A_String(sString));
	}
	
	static String remove_Space_Split_And_Reverse_A_String(String sString) {
		String[] split = sString.split(" ");
		String reverse="";
		for (int i = 0; i < split.length; i++) {
			for (int j = split[i].length()-1 ; j >=0 ; j--) {
				reverse+=split[i].charAt(j);
			}
		}
		return reverse;
	}
}
