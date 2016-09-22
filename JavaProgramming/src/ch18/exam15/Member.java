package ch18.exam15;

import java.io.Serializable;

public class Member implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3569344353946672924L;
	private String mid;
	private String mname;
	private String nation = "한국";
	private transient String mpassword;
	private int mage;
	private String job;
	
	
	public Member(String mid, String mname,  String mpassword, int mage) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mpassword = mpassword;
		this.mage = mage;
	}
	
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
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
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
}
