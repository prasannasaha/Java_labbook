package com.cg.labbook.lab6.exercise6;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Exercise6 
{
	public static void dateDifference()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in dd-mm-yyyy format:");
		String date=sc.next();
		LocalDate Date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate now = LocalDate.now();
		Period P=Period.between(Date,now);
		System.out.printf("The didderence is =\n%d Years %d Months %d Days", P.getYears(), P.getMonths(), P.getDays());
		sc.close();
	}
	public static void main(String [] args)
	{
		dateDifference();
	}
}
