package com.cg.labbook.lab1;

public class Lab1Exercise4 
{
	public static boolean checkNumber(int n)
	{	
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		int l=args.length;
		if(l==1)
		{
			if(checkNumber(Integer.parseInt(args[0]))==true)
			{
				System.out.println("Number is a power of 2");
			}
			else
			{
				System.out.println("Number is not a power of 2");
			}
		}
		else
		{
			System.out.println("Give n");
		}
	}
}
