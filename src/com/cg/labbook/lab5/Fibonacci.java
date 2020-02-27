package com.cg.labbook.lab5;

import java.util.Scanner;

public class Fibonacci 
{
	static int n1=0,n2=1,n3=0; 
	public static void fiboByNonRecur(int n)
	{
		int a=1;
		int b=1;
		int c=0;
		System.out.print(b+" , ");	
		for(int i=0;i<n-1;i++)
		{
			c=a+b;
			if(i==n-1)
			{
				System.out.println(c+" .");
			}
			else
			{
				System.out.print(c+" , ");	
			}
			a=b;
			b=c;
		}
	}
	static void printFibonacci(int count)
	{    
		if(count>0)
		{    
			n3 = n1 + n2;    
			n1 = n2;    
			n2 = n3;    
			System.out.print(n3+" , ");  	
			printFibonacci(count-1);    
		}    
	}    
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("Enter the number");
			Scanner sc =new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("Fibonacci by :");
			System.out.println("1-NonRecurssive Function");
			System.out.println("2-Recurssive Function");
			System.out.println("3-Quit");
			System.out.print("Enter the choice :");
			System.out.println();
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:fiboByNonRecur(n);
					System.out.println();
					System.out.println();
					break;
				case 2:printFibonacci(n);
					System.out.println();
					System.out.println();
					n1=0;
					n2=1;
					n3=0;
					break;
				case 3:sc.close();
					System.out.println("Come again");
					System.exit(0);
					break;
				default:System.out.println("Wrong choice");
			}
		}
	}
}
