package ch09.exam03;

public class A {
	//Field
	
	//Constructor
	
	//Method
	
	//Nested(Inner) Class
	
	public void method() //메소드 안에서 선언된건 로컬이라고 한다.
	{
		class B
		{
			//field
			//constructor
			//method
		}
		B b = new B();
	}
	
	public void method2()
	{
		class B{}  // 둘의 클래스 형질이 다르다.
	}
}
