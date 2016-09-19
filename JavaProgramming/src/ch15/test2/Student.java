package ch15.test2;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum,String name)
	{
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			Student st = (Student) obj;
			if(st.studentNum==studentNum) //문제 조건에 이름말고 학번이 같은 경우 중복 처리를 원하므로 학번이 같은 경우를 조건식으로 둔다.
			{
				return true;
			}		
		}
		return false;
	}
}
