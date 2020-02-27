package com.cg.labbook.lab2.model;
public class Video extends MediaItem 
{
	private String DIRECTOR;
	private String GENRE;
	private int YEAR_OF_REALEASE;
	

	public Video() {
		super();
	}

	public Video(int uID, String tITLE, int nOOFCOPIES, String dIRECTOR, String gENRE, int yEAR_OF_REALEASE) {
		super(uID, tITLE, nOOFCOPIES);
		DIRECTOR=dIRECTOR;
		GENRE=gENRE;
		YEAR_OF_REALEASE=yEAR_OF_REALEASE;

	}

	public String getDIRECTOR() {
		return DIRECTOR;
	}

	public void setDIRECTOR(String dIRECTOR) {
		DIRECTOR = dIRECTOR;
	}

	public String getGENRE() {
		return GENRE;
	}

	public void setGENRE(String gENRE) {
		GENRE = gENRE;
	}

	public int getYEAR_OF_REALEASE() {
		return YEAR_OF_REALEASE;
	}

	public void setYEAR_OF_REALEASE(int yEAR_OF_REALEASE) {
		YEAR_OF_REALEASE = yEAR_OF_REALEASE;
	}

	@Override
	public String toString() {
		return "Video [DIRECTOR=" + DIRECTOR + ", GENRE=" + GENRE + ", YEAR_OF_REALEASE=" + YEAR_OF_REALEASE
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object ob) {
		Video video = (Video)ob;
		if(super.equals(ob)==true && this.DIRECTOR==video.DIRECTOR && this.GENRE==video.GENRE && this.YEAR_OF_REALEASE==video.YEAR_OF_REALEASE )
			return true;
		
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.print(getDIRECTOR());
		System.out.print(getGENRE());
		System.out.print(getYEAR_OF_REALEASE());
	}

	
}
