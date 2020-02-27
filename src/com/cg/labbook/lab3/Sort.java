package com.cg.labbook.lab3;

public class Sort 
{
	public static void getsorted(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			int n=ar[i];
			int s=0;
			while(n>0)
			{
				int d=n%10;
				s=s*10+d;
				n=n/10;
			}
			ar[i]=s;
		}
		int temp;
        for (int i = 0; i < ar.length; i++) 
        {
            for (int j = i + 1; j <ar.length; j++) { 
                if (ar[i] > ar[j]) 
                {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
	}
	public static void main(String[] args) 
	{
		int ar[]= {10,12,33,89,78,22,77};
		getsorted(ar);
		for(int i=0;i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
