package com.cg.labbook.lab1;

public class Lab1Exercise3 
{
	public static boolean checkNumber(int number)
	{
		while(number>0)
		{
			int d=number%10;
			number/=10;
			int f=number%10;
			if(d<f)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int l=args.length;
		if(l==1)
		{
			if(checkNumber(Integer.parseInt(args[0]))==true)
			{
				System.out.println("Increasing Number");
			}
			else
			{
				System.out.println("Not increasing number");
			}
		}
		else
		{
			System.out.println("Give n");
		}
	}
}
