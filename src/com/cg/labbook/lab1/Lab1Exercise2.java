package com.cg.labbook.lab1;
public class Lab1Exercise2 
{
	public static int calculateDifference(int n)
	{
		int sum=0;
		int sq=0,sn=0;
		for(int i=0;i<=n;i++)
		{
			sq=sq+i*i;
			sn=sn+i;
		}
		sum=sn*sn-sq;
		return sum;
	}
	public static void main(String args[])
	{
		int l=args.length;
		if(l==1)
		{
			System.out.println("Difference="+calculateDifference(Integer.parseInt(args[0])));
		}
		else
		{
			System.out.println("Give n");
		}
	}
}
