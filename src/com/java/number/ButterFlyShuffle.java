package com.java.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ButterFlyShuffle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length = sc.nextInt();
		System.out.println("Enter the values of an array");
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		System.out.println(butterflySuffleArray(array));
		sc.close();
	}

	static List<Integer> butterflySuffleArray(int[] array) {
		int length=array.length/2;
		List<Integer> l = new ArrayList<Integer>();
		for (int i = array.length-1; i >=length; i--) {
			l.add(array[i]);
		}
		for (int i = 0; i < length; i++) {
			l.add(array[i]);
		}
		return l;
	}
}
