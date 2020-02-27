package com.ui;

import java.util.Scanner;

import com.utility.VehicleBO;

public class UserInterface 
{
	UserInterface()
	{
		
	}
	public static void main(String[] args) 
	{
		VehicleBO V=new VehicleBO();
		while(true)
		{
				
			System.out.println("1. Add Vehicle Details");
			System.out.println("2.Last Vehicle Id");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			Scanner sc =new Scanner (System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("Enter the vehicle type");
						String vehicleType=sc.next();
						System.out.println("Enter the vehicle Id");
						int vehicleId=sc.nextInt();
						V.addVehicleDetails(vehicleType, vehicleId);
					break;
				case 2:System.out.println("Enetr the vehile type to search the last element");
						String vehicle=sc.next();
						System.out.println(V.findLastVehicles(vehicle));
					break;
				case 3:System.exit(0);
					break;
				default:System.out.println("Wrong choice.. Try again");
			}
			sc.close();
		}
	}
}
