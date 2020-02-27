package com.cg.labbook.lab5;

public class Exercise3
{
	public static boolean chkprime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int number=50;
		for(int i=2;i<number;i++)
		{
			if(chkprime(i))
			{
				System.out.println(i);
			}
		}
	}
}
