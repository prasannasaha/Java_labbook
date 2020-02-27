package com.cg.labbook.lab5.exercise4.client;

import com.cg.labbook.lab5.exercise4.exception.EmployeeException;
import com.cg.labbook.lab5.exercise4.model.Employee;

public class Exercise4Client 
{
	public static void main(String[] args) 
	{
		try
		{
			new Employee();
		}
		catch(EmployeeException excep)
		{
			System.out.println("Exception Caught");
			System.out.println(excep.getMessage());
		}
		Employee E2=new Employee("Prasanna", "Saha");
		E2.show();
		Employee E3=new Employee("Prasanna");
		E3.show();
	}
}