package com.java.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class IncreaseCurrentMonthByNthValue {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		int date = sc.nextInt();
		System.out.println("Enter the month");
		int month = sc.nextInt();
		System.out.println("Enter the year ");
		int year=sc.nextInt();
		System.out.println("Enter no of months to add");
		int addMonth = sc.nextInt();
		String add_N_Of_Month = add_N_Of_Month(date,month,year,addMonth);
		System.out.println(add_N_Of_Month);
	}
	static String add_N_Of_Month(int date,int month,int year,int addMonth) throws ParseException {
		String s = year+"-"+month+"-"+date;
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(d.parse(s));
		c.add(Calendar.MONTH,addMonth);
		
		return d.format(c.getTime());
	}
}
