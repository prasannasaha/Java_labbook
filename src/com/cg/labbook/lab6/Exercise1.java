package com.cg.labbook.lab6;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Exercise1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line of integers");
		
		StringTokenizer s=new StringTokenizer(sc.nextLine()," ");
		sc.close();
		int sum=0;
		while(s.hasMoreTokens())
		{
			int a=Integer.parseInt(s.nextToken());
			System.out.println(a);
			sum=sum+a;
		}
		System.out.println("Sum="+sum);
	}
}
