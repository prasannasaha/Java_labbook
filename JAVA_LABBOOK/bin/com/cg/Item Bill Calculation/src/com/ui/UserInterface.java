package com.ui;
import java.util.Scanner;
import com.bean.Item;
import com.utility.Shop;
public class UserInterface 
{
	public UserInterface()
	{
		//default constructor
	}
	public static void main(String []args)
	{
		Shop S=new Shop();
		System.out.println("Enter thn number of items");
		Scanner sc =new Scanner(System.in);
		int noOfItems=sc.nextInt();
		for(int i=0;i<noOfItems;i++)
		{
			System.out.println("Enter the item details");
			System.out.println("Enter the item Id:");
			int id=sc.nextInt();
			System.out.println("Enter the item name");
			String itemName=sc.next();
			System.out.println("Enter the cost");
			double cost=sc.nextDouble();
			System.out.println("Enter the quantity");
			int quantity=sc.nextInt();
			Item I =new Item();
			I.setItemId(id);
			I.setItemName(itemName);
			I.setCost(cost);
			I.setQuantity(quantity);
			S.addItem(I);
		}
		System.out.println("Calculated Bill Amount"+S.calculateTotalBill());
		sc.close();
	}
}
