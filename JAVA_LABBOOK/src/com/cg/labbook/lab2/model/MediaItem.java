package com.cg.labbook.lab2.model;
public abstract class MediaItem extends Item
{
	public MediaItem() {
		super();
	}

	public MediaItem(int uID, String tITLE, int nOOFCOPIES) {
		super(uID, tITLE, nOOFCOPIES);
		
	}

	@Override
	public String toString() {
		return "MediaItem [toString()=" + super.toString() + "]";
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
