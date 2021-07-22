package com.java.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintUniqueNumbersOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array length");
		int length = sc.nextInt();
		System.out.println("Enter the value of the array");
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(getUniqueNumbersInAnArray(array));
	}
	
	static Set<Integer> getUniqueNumbersInAnArray(int[] array) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			s.add(array[i]);
		}
		return s ;
	}
	
}
