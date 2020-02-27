package com.cg.labbook.lab3;

public class Exercise1
{
	public static int getSecpndSmallest(int[] ar)
	{
		int max=999999999,max2=999999999;
		for(int i=0;i<ar.length;i++)
		{
			if(max>ar[i])
			{
				max=ar[i];
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(max2>ar[i])
			{
				if(max!=ar[i])
				{
					max2=ar[i];
				}
			}
		}
		return max2;
	}
	public static void main(String [] args)
	{
		int l=args.length;		
		if(l>0)
		{
			int ar[]=new int[l];
			for(int i=0;i<args.length;i++)
			{
				ar[i]=Integer.parseInt(args[i]);
			}
			System.out.println(getSecpndSmallest(ar));
		}
		else
		{
			System.out.println("Enter the array");
		}
	}
}
