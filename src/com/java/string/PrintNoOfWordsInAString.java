package com.java.string;

import java.util.Scanner;

public class PrintNoOfWordsInAString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String sString = sc.nextLine();
	System.out.println("No of words in the string is  "+getNoOfWordsInTheString(sString));
	sc.close();
}
static int getNoOfWordsInTheString(String sString) {
	String[] split = sString.split(" ");
	return split.length;
	
}
}
