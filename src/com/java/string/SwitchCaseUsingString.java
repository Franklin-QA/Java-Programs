package com.java.string;

import java.util.Scanner;

public class SwitchCaseUsingString {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String sString = sc.nextLine();
	System.out.println(getCorrespondentName(sString));
	sc.close();
}
static String getCorrespondentName(String sString) {
	String s = "";
	switch (sString) {
	case "frank":
		s="franklin "+ "8072333636";
		break;
	case "ash":
		s="abi "+ "807233366";
	default:
		s=null;
		break;
	}
	return s;
}
}
