package com.mycompany.myapp2.exam06;

public class Member {
	public String mid;
	public String mname;
	
	public Member(String mid,String mname)
	{
		this.mid = mid;
		this.mname=mname;
	}
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
}
