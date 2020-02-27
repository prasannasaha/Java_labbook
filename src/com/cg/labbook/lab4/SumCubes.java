package com.cg.labbook.lab4;

public class SumCubes
{
	public static int sumOfCubes(int a)
	{
		int s=0;
		while(a>0)
		{
			s=s+(int)Math.pow(a%10,3);
			a=a/10;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		System.out.println(sumOfCubes(22));
	}
}
