package com.cg.labbook.lab2.model;

public class Book extends WrittenItem 
{
	public Book()
	{
		super();
	}
	public Book(int uID, String tITLE, int nOOFCOPIES, String author) {
		super(uID, tITLE, nOOFCOPIES, author);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object ob) {
		return super.equals(ob);
	}

	@Override
	public void print() {
		super.print();
	}
}
