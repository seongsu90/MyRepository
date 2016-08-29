package ch06.exam11;

public class Board {
	private String bwriter;
	private String btitle;
	private String bcontent;
	private int bno;
	private int bHitCount;
	
	Board(int bno,String btitle,String bwriter,String bcontent, int bHitCount)
	{
		this.bno = bno;
		this.btitle = btitle;
		this.bwriter=bwriter;
		this.bcontent= bcontent;
		this.bHitCount = bHitCount;
	}
	
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getbHitCount() {
		return bHitCount;
	}
	public void setbHitCount(int bHitCount) {
		this.bHitCount = bHitCount;
	}
	
	}
