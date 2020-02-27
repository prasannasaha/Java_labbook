package com.cg.labbook.lab1;
public class Lab1Exercise1 
{
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		int l=args.length;
		if(l==1)
		{
			System.out.println("Sum="+calculateSum(Integer.parseInt(args[0])));
		}
		else
		{
			System.out.println("Give length");
		}
	}
}
