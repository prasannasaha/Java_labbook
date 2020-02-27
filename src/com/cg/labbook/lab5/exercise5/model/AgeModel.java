package com.cg.labbook.lab5.exercise5.model;

import com.cg.labbook.lab5.exercise5.exception.AgeException;

public class AgeModel {
	private int age;
	public AgeModel() throws AgeException
	{
		age=0;
		throw new AgeException("Age cannot be zero");
	}
	public AgeModel(int age)throws AgeException 
	{
		if(age <15)
			throw new AgeException("Minimum age is 15");
		this.age=age;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
