package com.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesOfAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String sString = sc.nextLine();
		System.out.println(removeDuplicatesOfAString(sString).toString().replaceAll(", ","").replace("[","").replace("]", ""));
		sc.close();
	}

	static List<Character> removeDuplicatesOfAString(String string) {
		List<Character> li= new ArrayList();
		for (int i = 0; i < string.length(); i++) {
			li.add(string.charAt(i));
		}
		for (int i = 0; i < li.size(); i++) {
			for (int j = i+1; j < li.size(); j++) {
				if (li.get(i).equals(li.get(j))) {
					li.remove(j);
					j--;
				}
			}
		}
		return li;
	}
}
