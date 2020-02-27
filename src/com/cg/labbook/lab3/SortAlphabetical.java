package com.cg.labbook.lab3;
public class SortAlphabetical 
{
	public static String[] getsorted(String ar[])
	{
		String temp;
        for (int i = 0; i < ar.length; i++) 
        {
            for (int j = i + 1; j <ar.length; j++)
            { 
                if (ar[i].compareTo(ar[j])>0) 
	            {
                	temp = ar[i];
	                ar[i] = ar[j];
	                ar[j] = temp;
	            }
            }
        }
        return ar;
	}
	public static void main(String[] args) 
	{
		String ar[]= {"PRASANNA", "PUSHPENDU","WAjeeD", "Aswathama","SUMON","Sumedha","Momo", "Preety", "Anindita"};
		int l=ar.length;
		int c;
		if(l%2==0)
		{
			c=l/2;
		}
		else
		{
			c=((int)(l/2))+1;
		}
		for(int i=0;i<c;i++)
		{
			ar[i]=ar[i].toUpperCase();
		}
		for(int i=c;i<l;i++)
		{
			ar[i]=ar[i].toLowerCase();
		}
		getsorted(ar);
		for(int i=0;i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
	}
} 