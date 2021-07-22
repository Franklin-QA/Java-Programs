package com.java.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array length");
		int length = sc.nextInt();
		System.out.println("Enter the value of the array");
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(removeDuplicatesOfAnArray(array));
	}
	
	static List<Integer> removeDuplicatesOfAnArray(int[] array) {
		List<Integer> l= new ArrayList<Integer>();
		for (int i = 0; i <array.length; i++) {
			l.add(array[i]);
			}
		for (int i = 0; i < l.size(); i++) {
			for (int j = i+1; j < l.size(); j++) {
				if (l.get(i).equals(l.get(j))) {
					l.remove(j);
					j--;
				}
			}
		}
		return l;
	}
}
