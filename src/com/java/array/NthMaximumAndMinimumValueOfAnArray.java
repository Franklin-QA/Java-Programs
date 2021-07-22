package com.java.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NthMaximumAndMinimumValueOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array length");
		int length = sc.nextInt();
		System.out.println("Enter the value of the array");
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the Nth max and min value You want to get");
		int nthTerm = sc.nextInt();
		System.out.println(getNthMinAndMaxInList(array, nthTerm));
		System.out.println(getNthMinAndMax(array, nthTerm));
	}

	static String getNthMinAndMax(int[] array, int term) {
		int temp=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return "minimum "+ term +" value is : "+ String.valueOf(array[term-1]) +"\n" + "Maximum "+ term +" value is : "+String.valueOf(array[array.length-term]);
	}

	
	static String getNthMinAndMaxInList(int[] array, int term) {
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			li.add(array[i]);
		}
		Collections.sort(li);
		return "minimum Value : "+String.valueOf(li.get(term-1))+"\n"+"Maximum Value : "+String.valueOf(li.get(li.size()-term));
	}
}
