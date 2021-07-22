package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChracterOccuranceOfAWord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String word = sc.nextLine();
		System.out.println(occuranceOfACharacter(word).toString());
		
	}
	static Map<Character, Integer> occuranceOfACharacter(String word){
		char[] charArray = word.toCharArray();
		Map<Character, Integer> mp= new HashMap();
		for (int i = 0; i < charArray.length; i++) {
			if (mp.containsKey(charArray[i])) {
				Integer a = mp.get(charArray[i]);
				mp.put(charArray[i], a+1);
			}else {
				mp.put(charArray[i], 1);
			}
		}
		return mp;
	}
}
