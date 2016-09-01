package ch09.exam04;

public class A {

	public A()
	{
		B b = new B();
	}
	
	void method()
	{
		B b = new B(); // A객체가 생성되야 생성되니 때문에 가능한 코딩이다.
	}
	
	static void method2()
	{
		//B b = new B(); //static 의 경우 A 객체 없이 실행되야되는데 B 클래스가 A객체가 있어야 완성된다.
	}
	
	public class B {
		int field1;
		//static int field;  // static 때문에 B객체 없이 사용가능해야되는데 B객체 자체가 public이여서 안된다.
		void method1()
		{
			
		}
	}
	
	
	
	
	
	
	//Field
	
	//Constructor
	
	//Method
	
	//Nested(Inner) Class
	
	
	
	
	/*public void method() //메소드 안에서 선언된건 로컬이라고 한다.
	{
		int value = 1;
		//value = 3; // 로컬 변수는 파이널 특성을 가지기 떄문에 이게 잘못된거다.
		class B
		{
			//field
			//constructor
			//method
			public void method2()
			{
				
				int result = value +1;
				System.out.println(result);
			}
		}
		B b = new B();
		b.method2();
	}*/
	
	
}
