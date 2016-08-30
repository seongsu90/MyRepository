package ch07.exam12;

public class Theater {
	public void check(Person person)
	{
		if(person instanceof Adult) // 객체 타입 확인 .. adult 가 person 객체로 생성된거냐
		{
			Adult adult = (Adult) person;
			System.out.println("주민번호: "+adult.ssn);
		}
		
		if(person instanceof Student)
		{
			Student student = (Student) person;
			System.out.println("학생번호: "+student.sno);
		}
	}
}
