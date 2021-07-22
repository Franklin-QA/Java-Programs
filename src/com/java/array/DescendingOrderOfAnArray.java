package com.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrderOfAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Length");
		int length = sc.nextInt();

		System.out.println("Enter the values of an array");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(descendingOrder(arr)));
		sc.close();
	}

	static int[] descendingOrder(int[] array) {
		Arrays.sort(array);
		return array;
	}
}
