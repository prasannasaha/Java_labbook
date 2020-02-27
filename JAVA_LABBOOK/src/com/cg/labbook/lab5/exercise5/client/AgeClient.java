package com.cg.labbook.lab5.exercise5.client;

import com.cg.labbook.lab5.exercise5.exception.AgeException;
import com.cg.labbook.lab5.exercise5.model.AgeModel;

public class AgeClient 
{
	public static void main(String[] args) 
	{
		AgeModel a1;
		try 
		{
			a1=new AgeModel();
			System.out.println("Object creation successful with age="+a1.getAge());
		}
		catch(AgeException e)
		{
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
		try {
			AgeModel a2=new AgeModel(2);
			System.out.println("Object creation successful with age="+a2.getAge());
		}
		catch(AgeException e)
		{
			System.out.println("Exception Caught");
			System.err.println(e.getMessage());
		}
		try {
			AgeModel a3=new AgeModel(17);
			System.out.println("Object creation successful with age="+a3.getAge());
		}
		catch(AgeException e)
		{
			System.out.println("Exception Caught");
			System.out.println(e.getMessage());
		}
	}
}
