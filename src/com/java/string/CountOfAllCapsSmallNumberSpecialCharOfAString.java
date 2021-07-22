package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfAllCapsSmallNumberSpecialCharOfAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String sString = sc.nextLine();
		System.out.println(countOfSmallCapsNumbersAndSpecialChar(sString));
		System.out.println(AlterCountSmallCapsNumbersAndSpecialCounts(sString));
	}

	static Map<String, Integer> countOfSmallCapsNumbersAndSpecialChar(String sString) {
		char[] ch = sString.toCharArray();
		int iLowerCaseCount = 0;
		int iUpperCaseCount = 0;
		int iSpecialCharactersCount = 0;
		int iNumbersCount = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				iUpperCaseCount++;
			} else if (ch[i] > 97 && ch[i] <= 122) {
				iLowerCaseCount++;
			} else if (ch[i] >= 48 && ch[i] <= 57) {
				iNumbersCount++;
			} else {
				iSpecialCharactersCount++;
			}

		}
		Map<String, Integer> m = new HashMap();
		m.put("Upper case Count ", iUpperCaseCount);
		m.put("lower case Count ", iLowerCaseCount);
		m.put("Number Count ", iNumbersCount);
		m.put("Special Character Count ", iSpecialCharactersCount);
		return m;
	}
	
	/*Alternate way*/
	
	static Map<String, Integer> AlterCountSmallCapsNumbersAndSpecialCounts(String sString){
		char[] ch = sString.toCharArray();
		int iLowerCaseCount = 0;
		int iUpperCaseCount = 0;
		int iSpecialCharactersCount = 0;
		int iNumbersCount = 0;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				iUpperCaseCount++;
			} else if (Character.isLowerCase(ch[i])) {
				iLowerCaseCount++;
			} else if (Character.isDigit(ch[i])) {
				iNumbersCount++;
			} else {
				iSpecialCharactersCount++;
			}
		
	}
		Map<String, Integer> m = new HashMap();
		m.put("Upper case Count ", iUpperCaseCount);
		m.put("lower case Count ", iLowerCaseCount);
		m.put("Number Count ", iNumbersCount);
		m.put("Special Character Count ", iSpecialCharactersCount);
		return m;
	}
}
