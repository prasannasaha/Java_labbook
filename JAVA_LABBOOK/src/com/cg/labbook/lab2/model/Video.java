package com.cg.labbook.lab2.model;

public class Video extends MediaItem 
{
	private String director;
	private String genre;
	private int year;
	
	//Constructors
	
	
	public Video() 
	{
		super();
	}
	
	public Video(int identificationNumber, String title, int numberOfCopies, int runtime,String director,String genre,int year)
	{
		super(identificationNumber, title, numberOfCopies, runtime);
		this.director=director;
		this.genre= genre;
		this.year=year;
	}
	
	
	//Setters and Getters
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
