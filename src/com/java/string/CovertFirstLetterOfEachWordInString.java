package com.java.string;

import java.util.Scanner;

public class CovertFirstLetterOfEachWordInString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String sString = sc.nextLine();
		System.out.println((convertFirstLetterOfEachWordToUpperCase(sString)));
		sc.close();
		
	}
	static StringBuilder convertFirstLetterOfEachWordToUpperCase(String sString){
		String[] split = sString.split(" ");
		StringBuilder stringBuffer=new StringBuilder("");
		for (int i = 0; i < split.length; i++) {
		char upperCase = Character.toUpperCase(split[i].charAt(0)); 
		stringBuffer.append(upperCase+split[i].substring(1)+" ");
		}
		return stringBuffer;
	}
}
