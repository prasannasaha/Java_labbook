package com.cg.labbook.lab7;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

	public static HashMap<Character , Integer> countCharacter(char[] ar)
	{
		HashMap<Character, Integer> H=new HashMap<>();
        for (char c : ar) 
        { 
            if (H.containsKey(c)) 
            {  
                H.put(c,H.get(c) + 1); 
            } 
            else 
            { 
            	H.put(c, 1); 
            } 
        } 
		return H;
	}
	public static void main(String[] args) 
	{
		String S="Prasanna";
		HashMap <Character, Integer> H=countCharacter(S.toCharArray());
		for(Map.Entry<Character, Integer> m: H.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}

}
