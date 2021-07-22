package com.java.string;

import java.util.Scanner;

public class PrintNoOfCharInAString {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String sString = sc.nextLine();
	System.out.println(getOnlySmallAndcapsOfAString(sString));
}
static String getOnlySmallAndcapsOfAString(String sString){
	char[] ch = sString.toCharArray();
	String s="";
	for (int i = 0; i < ch.length; i++) {
		if (Character.isLetter(ch[i])) {
			s=s+ch[i];
		}
	}
	return s;
}
}
