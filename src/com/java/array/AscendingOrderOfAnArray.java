package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AscendingOrderOfAnArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int arrayLength = sc.nextInt();
		System.out.println("Enter the values for the Array");
		int[] a = new int[arrayLength];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(ascendingOrder(a)));
		System.out.println(ascendingOrderWithList(a));
	}
	
	static int[] ascendingOrder(int[] array) {
		int temp= 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}

	/*
	 * Ascending order with List Involved
	 */
	
	static List<Integer> ascendingOrderWithList(int[] array){
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			l.add(array[i]);
		}
		Collections.sort(l);
		return l;
	}
}
