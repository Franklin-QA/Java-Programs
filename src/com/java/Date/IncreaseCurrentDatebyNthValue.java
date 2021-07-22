package com.java.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class IncreaseCurrentDatebyNthValue {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		int date = sc.nextInt();
		System.out.println("Enter the month");
		int month = sc.nextInt();
		System.out.println("Enter the year ");
		int year=sc.nextInt();
		System.out.println("Enter no of days to add");
		int adddate = sc.nextInt();
		String add_N_Of_Date = add_N_Of_Date(date,month,year,adddate);
		System.out.println(add_N_Of_Date);
	}
	
	static String add_N_Of_Date(int date,int month, int year,int daystoadd) throws ParseException{
		String s = year+"-"+month+"-"+date;
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(d.parse(s));
		c.add(Calendar.DATE, daystoadd);
		return d.format(c.getTime());
	}
}
