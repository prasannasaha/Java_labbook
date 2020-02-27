package com.cg.labbook.lab6.exercise7;

import java.util.Scanner;

public class Exercise7 
{
	public static boolean checkValidUserName(String S)
	{
		int count=0;
		int f=1;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i) !='_' && f==1)
			{
				count++;
			}
			if(S.charAt(i)=='_')
			{
				f=0;
			}
		}
		if(f==0 && S.substring(S.lastIndexOf('_')).equals("_job") && count>=8 )
		{
			return true;
		}
		else 
			return false;
	}
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the username: ");
		String S=sc.next();
		if(checkValidUserName(S))
		{
			System.out.println("Valid username");
		}
		else
		{
			System.out.println("Not a Valid username");
		}
		sc.close();
	}
}
