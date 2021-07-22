package com.java.OddEven;

import java.util.Scanner;

public class CheckOddOrEven {
	
	public static String CheckNoOddOreven(int Number){
		String s;
		if (Number%2==0) {
			s="Even";
		}else {
			s="odd";
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int Number = sc.nextInt();
		String checkNoOddOreven = CheckNoOddOreven(Number);
		System.out.println("Number is : " +checkNoOddOreven);
		
	}
	
}
