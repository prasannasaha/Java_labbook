package com.cg.labbook.lab2.model;

public class JournalPaper extends WrittenItem {
	private int YEAR_OF_PUBLISH;

	public JournalPaper() {
		super();
	}
	public JournalPaper(int uID, String tITLE, int nOOFCOPIES, String author,int yEAR_OF_PUBLISH) {
		super(uID, tITLE, nOOFCOPIES, author);
		YEAR_OF_PUBLISH = yEAR_OF_PUBLISH;
	}
	public int getYEAR_OF_PUBLISH() {
		return YEAR_OF_PUBLISH;
	}
	public void setYEAR_OF_PUBLISH(int yEAR_OF_PUBLISH) {
		YEAR_OF_PUBLISH = yEAR_OF_PUBLISH;
	}
	
	
	@Override
	public String toString() {
		return "JournalPaper [YEAR_OF_PUBLISH=" + YEAR_OF_PUBLISH + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object ob) {
		JournalPaper journalpaper=(JournalPaper)ob;	//transfer object type to Item type
		if(super.equals(journalpaper)==true && this.YEAR_OF_PUBLISH==journalpaper.YEAR_OF_PUBLISH) {
			return true;
		}
		return false;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.print(getYEAR_OF_PUBLISH());
	}
	
	
	
}
