package com.cg.labbook.lab2.model;

public abstract class Item 
{
	//Data Members
	private int identificationNumber;
	private String title;
	private int numberOfCopies;
	
	
	//Constructors
	
	
	public Item()
	{
		/*Default constructor*/
	}
	public Item(int identificationNumber, String title, int numberOfCopies) 
	{
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

	
	//Getter and Setters
	
	
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	//Abstract methods


	
	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", numberOfCopies="
				+ numberOfCopies + "]";
	}
	
	
	
}
