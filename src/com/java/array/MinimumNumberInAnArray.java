package com.java.array;

import java.util.Scanner;

public class MinimumNumberInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length");
		int length = sc.nextInt();
		System.out.println("Enter the values of an array");
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(minNumberOfArray(array));
		sc.close();
	}

	static int minNumberOfArray(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[0];
	}

}
