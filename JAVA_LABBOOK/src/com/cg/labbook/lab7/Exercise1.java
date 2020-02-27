package com.cg.labbook.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Exercise1 
{
	public static List<String> getValues( HashMap<Integer,String> H)
	{
		List <String> L=new ArrayList<>();
		for(Map.Entry<Integer, String> m:H.entrySet())
		{	
			L.add(m.getValue());
			
		}
		Collections.sort(L);
		return L;
	}
	public static void main(String[] args) 
	{
		HashMap<Integer, String> H= new HashMap<>();
		H.put(1000, "Prasanna Saha");
		H.put(1001, "Sumon Mondal");
		H.put(1002, "Shubhadip Maiti");
		H.put(1003, "Rishav Chowdhury");
		List<String> list=getValues(H);
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}
	}
}
