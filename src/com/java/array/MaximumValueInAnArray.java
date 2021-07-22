package com.java.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumValueInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the values of an array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(maximumValueInAnArrayWithList(array));
		System.out.println(maxValueOfArray(array));
	}

	static Integer maximumValueInAnArrayWithList(int[] arr) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			l.add(arr[i]);
		}
		Integer max = Collections.max(l);
		return max;
	}
	
	/*
	 * Maximum value with Arrays 
	 */
	
	static int maxValueOfArray(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[0];
	}

}
