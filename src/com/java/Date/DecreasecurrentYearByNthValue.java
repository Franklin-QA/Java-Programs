package com.java.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DecreasecurrentYearByNthValue {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		int date = sc.nextInt();
		System.out.println("Enter the month");
		int month = sc.nextInt();
		System.out.println("Enter the year ");
		int year=sc.nextInt();
		System.out.println("Enter no of year to add");
		int addYear = sc.nextInt();
		String add_N_Of_Year = add_N_Of_year(date,month,year,addYear);
		System.out.println(add_N_Of_Year);
	}
	static String add_N_Of_year(int date,int month,int year,int addYear) throws ParseException{
		String s = year+"-"+month+"-"+date;
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(d.parse(s));
		c.add(Calendar.YEAR, addYear);
		return d.format(c.getTime());
	}
	
}
