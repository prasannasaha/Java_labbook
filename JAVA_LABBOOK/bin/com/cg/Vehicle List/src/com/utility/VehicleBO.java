package com.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class VehicleBO 
{
	private Map<String,List<Integer>> vehicleMap;
	public VehicleBO()
	{
		//default constructor
		vehicleMap=new HashMap<>();
	}
	//getters and setters
	public Map<String, List<Integer>> getVehicleMap() {
		return vehicleMap;
	}
	public void setVehicleMap(Map<String, List<Integer>> vehicleMap) {
		this.vehicleMap = vehicleMap;
	}
	public void addVehicleDetails(String vehicleType, int vehicleNumber)
	{
		List<Integer> num=new ArrayList<>();
		num.add(vehicleNumber);
		this.vehicleMap.put(vehicleType, num);
	}
	public int findLastVehicles(String S)
	{
		int vehiclenumber=0;;
		for(Entry<String, List<Integer>> m:this.vehicleMap.entrySet())
		{	
			if(m.getKey().equalsIgnoreCase(S))
			{
				Iterator I=m.getValue().iterator();
				while(I.hasNext())
				{
					vehiclenumber=(int)I.next();
				}
			}
		}
		return vehiclenumber;
	}
}
