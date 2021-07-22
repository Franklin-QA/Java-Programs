package com.java.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicatesOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array length");
		int length = sc.nextInt();
		System.out.println("Enter the value of the array");
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(duplicatesOfAnArray(array));
	}
	
	static Set<Integer> duplicatesOfAnArray(int[] array) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j]) {
					s.add(array[i]);
				}
			}
		}
		return s;
	}
	
}
