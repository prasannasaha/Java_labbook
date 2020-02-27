package com.cg.labbook.lab2.model;

public abstract class WrittenItem extends Item 
{
	private String author;
	
	
	//Constructors
	
	
	public WrittenItem()
	{
		super();
		//Default Constructor
	}
	public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author)
	{
		super(identificationNumber, title, numberOfCopies);
		this.author=author;
	}
	
	
	//Getter Setters
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
