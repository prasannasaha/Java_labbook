package com.cg.labbook.lab3;

public class Exercise4
{
	public static void freqcount(char []ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int c=1;
			if(ar[i]=='0')
			{
				continue;
			}
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]=='0')
					continue;
				if(ar[i]==ar[j])
				{
					c++;
					ar[j]='0';
				}
			}
			System.out.println(ar[i]+" occurred "+c+" times");
			ar[i]='0';
		}
	}
	public static void main(String[] args) 
	{
		char ar[]= {'a','a','b','c','d','d','a','a','a'};
		freqcount(ar);
	}
}