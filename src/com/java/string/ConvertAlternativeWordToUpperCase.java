package com.java.string;

import java.util.Scanner;

public class ConvertAlternativeWordToUpperCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the String");
	String line = sc.nextLine();
	StringBuffer alterNativeWordToUpperCase = alterNativeWordToUpperCase(line);
	System.out.println(alterNativeWordToUpperCase);
}
static StringBuffer alterNativeWordToUpperCase(String sString){
	char[] ch = sString.toCharArray();
	StringBuffer s = new StringBuffer("");
	for (int i = 0; i < ch.length; i++) {
		if (i%2==1) {
			//System.out.print(String.valueOf(ch[i]).toUpperCase());
			char c = Character.toUpperCase(ch[i]);
			s.append(c);
		}else {
			s.append(ch[i]);
		}
	}
	return s;
}
}
