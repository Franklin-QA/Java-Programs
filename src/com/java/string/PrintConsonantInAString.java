package com.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintConsonantInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String sString = sc.nextLine();
		System.out.println(getConsonantOfAString(sString).toString());
	}
	
	static List<Character> getConsonantOfAString(String sString){
		List<Character> l = new ArrayList<Character>();
		for (int i = 0; i < sString.length(); i++) {
			char ch = sString.charAt(i);
			if (ch!='A'& ch!='a'&ch!='e' & ch!='E'&ch!='i'&ch!='I'&ch!='o'&ch!='O'&ch!='U'&ch!='u') {
				l.add(ch);
			}
		}
		return l;
	}
}
