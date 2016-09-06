package ch11.test;

public class Member {
	private String id;
	private String name;
	
	public Member(String id,String name)
	{
		this.id =id;
		this.name=name;
	}
	
	//여기에 작성하기
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+": "+name;
	}
}
