package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordOccuranceOfAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String sString = sc.nextLine();
		System.out.println(getOccuranceOfAword(sString));
	}
	static Map<String, Integer> getOccuranceOfAword(String sString){
		String[] split = sString.split(" ");
		Map<String, Integer> mp = new HashMap<String, Integer>();
		for (int i = 0; i < split.length; i++) {
			if (mp.containsKey(split[i])) {
				Integer a = mp.get(split[i]);
				mp.put(split[i], a+1);
			}else {
				mp.put(split[i], 1);
			}
		}
		return mp;
	}
}
