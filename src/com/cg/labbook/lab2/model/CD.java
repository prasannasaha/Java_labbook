package com.cg.labbook.lab2.model;

public class CD extends MediaItem
{
	private String ARTIST;
	private String GENRE;

	public CD() {
		super();
	}

	public CD(int uID, String tITLE, int nOOFCOPIES, String aRTIST, String gENRE) 
	{
		super(uID, tITLE, nOOFCOPIES);
		ARTIST=aRTIST;
		GENRE=gENRE;
	}

	public String getARTIST() {
		return ARTIST;
	}

	public void setARTIST(String aRTIST) {
		ARTIST = aRTIST;
	}

	public String getGENRE() {
		return GENRE;
	}

	public void setGENRE(String gENRE) {
		GENRE = gENRE;
	}

	@Override
	public String toString() {
		return "CD [ARTIST=" + ARTIST + ", GENRE=" + GENRE + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object ob) {
		CD CD=(CD)ob;
		if(super.equals(ob)==true && this.ARTIST==CD.ARTIST && this.GENRE==CD.GENRE)
			return true;
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.print(getARTIST());
		System.out.print(getGENRE());
	}
	
	
}
