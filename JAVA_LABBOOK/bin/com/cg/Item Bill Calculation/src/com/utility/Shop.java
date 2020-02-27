package com.utility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.bean.Item;
public class Shop 
{
	private List<Item> itemList;
	public Shop()
	{
		itemList=new ArrayList<Item>();
	}
	public List<Item> getitemList() {
		return itemList;
	}
	public void setitemList(List<Item> l) {
		itemList = l;
	}
	public void addItem(Item I)
	{
		double totalPrice=I.getCost()*I.getQuantity();
		if(totalPrice >10000)
		{
			I.setCategory("A");
		}
		else if(totalPrice >=5000 && totalPrice <=10000)
		{
			I.setCategory("B");
		}
		else
		{
			I.setCategory("C");
		}
		this.itemList.add(I);
	}
	public double calculateTotalBill()
	{
		double totalBill=0;
		if(this.itemList.isEmpty())
			return -1;
		else
		{
			
			Iterator I=this.itemList.iterator();
			while(I.hasNext())
			{
				Item item=(Item)I.next();
				if(item.getCategory().equals("A"))
				{
					totalBill=totalBill+item.getCost()*item.getQuantity()+(5*item.getCost()*item.getQuantity())/100;
				}
				else if(item.getCategory().equals("B"))
				{
					totalBill=totalBill+item.getCost()*item.getQuantity()+(10*item.getCost()*item.getQuantity())/100;
				}
				else
				{
					totalBill=totalBill+item.getCost()*item.getQuantity()+(15*item.getCost()*item.getQuantity())/100;
				}
			}
		}
		return totalBill;
	}
}
