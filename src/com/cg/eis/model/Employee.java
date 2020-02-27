package com.cg.eis.model;

import com.cg.eis.exception.EmployeeException;

public class Employee 
{
	private String name;
	private double salary;
	
	public Employee()
	{
		//default constructor
	}
	public Employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void show() throws EmployeeException
	{
		if(this.salary<3000)
		{
			throw new EmployeeException("Salary not sufficient");
		}
		System.out.println("Employee name= "+this.name+" with salary="+this.salary);
	}
}
