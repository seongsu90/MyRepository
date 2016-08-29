package ch06.exam14;

public class Calculator2 {
	
	//Field
	
	final int field2; //이것도 인스턴스 필드다. final은 선언할때 초기화를 한다. 이 상태는 아무값도 없는 상태다
	
	static final int field4; //final 값은 한번 정해지면 변경이 안된다.
	
	//Constructor
	Calculator2()
	{
		field2=2; // final은 값을 바꿀수 없다. 생성자에서 초기화선언이 가능하다.
	}
	
	static
	{
		field4=5;
	}
	
	//Method
}
