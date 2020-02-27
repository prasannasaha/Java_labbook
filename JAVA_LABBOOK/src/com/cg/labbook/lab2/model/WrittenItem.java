package com.cg.labbook.lab2.model;
public abstract class WrittenItem extends Item 
{
	private String author;

	public WrittenItem() {
		super();	
	}

	public WrittenItem(int uID, String tITLE, int nOOFCOPIES,String author) {
		super(uID, tITLE, nOOFCOPIES);
		this.author = author;
		
	}

	public String getAuthor() {
		//check
		return author;
	}

	public void setAuthor(String author) {
		//check
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object ob) {
		WrittenItem WrittenItemob=(WrittenItem)ob;	//transfer object type to Item type
		if(super.equals(WrittenItemob)==true && this.author==WrittenItemob.author) {
			return true;
		}
		return false;
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.print(getAuthor());
	}


	
}
