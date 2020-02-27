package com.cg.labbook.lab5;

import java.util.Scanner;

public class Exercise1 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("Please select a light:");
			System.out.println("1)Red light");
			System.out.println("2)Yellow light");
			System.out.println("3)Green light");
			System.out.println("4)Quit");
			System.out.print("Enter the choice:");
			
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("stop");
						break;
				case 2:System.out.println("ready");
						break;
				case 3:System.out.println("go");
						break;
				case 4:sc.close();
						System.out.println("Come again");
						System.exit(0);
						break;
				default:System.out.println("Wrong choice");
			}
		}
	}
}
