package ch11.exam12;

public class Member implements Comparable{
	
	private String name;
	
	public Member(String name)
	{
		this.name=name;
	}
	
	@Override
	public int compareTo(Object o) {
		Member target = (Member)o;
		return name.compareTo(target.name); // 이렇게 하면 사전순으로 비교
	}
	
	
}
