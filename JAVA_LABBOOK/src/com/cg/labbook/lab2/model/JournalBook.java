package com.cg.labbook.lab2.model;

public class JournalBook extends WrittenItem
{
	private int year;
	//constructors
	public JournalBook()
	{
		super();
	}
	
	public JournalBook(int identificationNumber, String title, int numberOfCopies, String author,int year) 
	{
		super(identificationNumber,title,numberOfCopies,author);
		this.year = year;
	}

	//Setters and Getters
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
