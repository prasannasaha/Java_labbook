package com.cg.labbook.lab2.model;

public abstract class Item 
{
	private int UID;
	private String TITLE;
	private int NOOFCOPIES=0;
	
	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public int getNOOFCOPIES() {
		return NOOFCOPIES;
	}

	public void setNOOFCOPIES(int nOOFCOPIES) {
		NOOFCOPIES = nOOFCOPIES;
	}

	public Item() {
		super();
	}
	
	public Item(int uID, String tITLE, int nOOFCOPIES) {
		super();
		UID = uID;
		TITLE = tITLE;
		NOOFCOPIES = nOOFCOPIES;
	}
	@Override
	public boolean equals(Object ob){
		//here equal code will be written after create subclasses
		//wait & check codes
		Item itemob=(Item)ob;	//transfer object type to Item type
		if(this.UID==itemob.UID && this.TITLE==itemob.TITLE && this.NOOFCOPIES==itemob.NOOFCOPIES) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		//override to string method
		return "Item [UID=" + UID + ", TITLE=" + TITLE + ", NOOFCOPIES=" + NOOFCOPIES + "]";
	}
	//print method definition in abstract class item
	public void print() {
		System.out.print(getUID());
		System.out.print(getTITLE());
		System.out.print(getNOOFCOPIES());
	}
	
	public void checkIn() {
		//empty method write code here
	}
	
	public void checkOut() {
		//empty method write code here 
	}
	public void addItem() {
		//write code here
	}
}
