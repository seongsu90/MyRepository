package ch15.exam02;

public class Member {
	private String name;
	private int age;
	
	
	public Member(String name, int age) {
		this.name = name; //생성자 주입
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return name.hashCode()+age; //문자열의 해쉬코드는 같다.
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member)
		{
			Member target = (Member) obj;
			if(name.equals(target.name)&& age == target.age)
					{
					return true;
					}
			else
			{
				return false;
			}
		}else
		{
			return false;
		}
	}
}
