package com.cg.eis.client;

import com.cg.eis.exception.EmployeeException;
import com.cg.eis.model.Employee;

public class EmployeeClient 
{
	public static void main(String[] args) 
	{
		Employee E1=new Employee();
		Employee E2=new Employee("Prasanna Saha", 2200);
		Employee E3=new Employee("Prasanna Saha", 22000);
		try{
			E1.show();
		}
		catch(EmployeeException e)
		{
			System.out.println("Exception Caught");
			e.getMessage();
		}
		try{
			E2.show();
		}
		catch(EmployeeException e)
		{
			System.out.println("Exception Caught");
			e.getMessage();
		}
		try{
			E3.show();
		}
		catch(EmployeeException e)
		{
			System.out.println("Exception Caught");
			e.getMessage();
		}
		
	}

}
