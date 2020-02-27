package com.cg.labbook.lab6.exercise5;

import java.util.Scanner;

public class Exercise5 
{
	public static boolean checkPositiveString(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)>=s.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String :");
		String s=sc.next();
		if(checkPositiveString(s.toLowerCase()))
		{
			System.out.println("String is positive");
		}
		else
		{
			System.out.println("String is not positive");
		}
		sc.close();
	}
}
