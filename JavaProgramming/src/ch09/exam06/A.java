package ch09.exam06;

public class A { //클래스 블록내에서 순서는 선언 상관없다. 하지만 메소드 안에서는 실행순서를 따진다.
	int field = 10;
	
		
	public void method() //메소드 안에서 선언된건 로컬이라고 한다.
	{
		final int local = 10; // 로컬 변수를 로컬 클래스안에서 쓰려면 변수앞에 final을 붙여야 된다. 8버전부터는 final이 붙는다. 가독성을 위해 final을 쓰자
		class B //Nested의 로컬 클래스
		{
			void method()
			{
				//local = 5;
				field = 5;
				int result = local +field;
			}
		}
		B b = new B();
	}
	
	
}
