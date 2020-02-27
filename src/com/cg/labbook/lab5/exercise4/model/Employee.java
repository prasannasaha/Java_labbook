package com.cg.labbook.lab5.exercise4.model;

import com.cg.labbook.lab5.exercise4.exception.EmployeeException;

public class Employee
{
	private String firstName;
	private String lastName;

	public Employee() throws EmployeeException
	{
		throw new EmployeeException("Provide atleast the first name");
	}
	public Employee(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	public Employee(String firstName)
	{
		this.firstName=firstName;
		this.lastName=" ";
	}
	public void show()
	{
		System.out.print(this.firstName+" ");
		System.out.println(this.lastName);
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
}
