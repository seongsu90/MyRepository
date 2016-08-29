package ch06.exam17;

public class Member {
	
	private String mid;
	private String mname;
	private String mpassword;
	private int mage;
	private boolean madult;
	private double mheight;
	
	public Member(String mid)
	{
		this.mid = mid;
	}
	
	public String getMid() //getter 메소드다.
	{
		return mid;
	}
	
	public void setMheight(double mheight) //setter 메소드다.
	{
		if(mheight < 0)
			mheight = 0.0;
		
		this.mheight = mheight;
	}
}
