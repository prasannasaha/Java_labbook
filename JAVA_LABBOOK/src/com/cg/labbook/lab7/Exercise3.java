package com.cg.labbook.lab7;

import java.util.HashMap;
import java.util.Map;

public class Exercise3
{
	public static HashMap<Integer, Integer> getSquares(int []a)
	{
		HashMap<Integer, Integer> H =new HashMap<>();
		for(int b: a)
		{
			if(H.containsKey(b)==false)
			{
				H.put(b,b*b);
			}
		}
		return H;
	}
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5,6,7,8,9,10};
		HashMap<Integer, Integer> H =getSquares(ar);
		for(Map.Entry<Integer,Integer> m:H.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
