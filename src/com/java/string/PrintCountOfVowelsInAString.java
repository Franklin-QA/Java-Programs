package com.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintCountOfVowelsInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String sString = sc.nextLine();
		System.out.println(getVowelsOfAString(sString).toString());
	}
	
	static List<Character> getVowelsOfAString(String sString){
		List<Character> li= new ArrayList<Character>();
		char[] vowels = {'a','e','i','o','u'};
		for (int i = 0; i < sString.length(); i++) {
			int count = 0;
			for (int j = 0; j < vowels.length; j++) {
				if (sString.charAt(i)==vowels[j]) {
					count++;
				}
			}
			if (count==0) {
				li.add(sString.charAt(i));
			}
		}
		return li;
	}
}
