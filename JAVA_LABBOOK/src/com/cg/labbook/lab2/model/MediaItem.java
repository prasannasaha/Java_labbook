package com.cg.labbook.lab2.model;

public abstract class MediaItem extends Item
{
	private int runtime;
	
	
	//Constructors
	
	
	public MediaItem()
	{
		super();
	}

	public MediaItem(int identificationNumber, String title, int numberOfCopies,int runtime)
	{
		super(identificationNumber, title, numberOfCopies);
		this.runtime=runtime;
	}
	
	
	//Setters and Getters
	
	
	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
}
