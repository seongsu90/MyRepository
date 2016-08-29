package ch06.exam14;

public class Calculator3 {
	
	//Field
	
	final int field2; //이것도 인스턴스 필드다. final은 선언할때 초기화를 한다. 이 상태는 아무값도 없는 상태다

	
	//Constructor
	Calculator3(int field2)
	{
		this.field2=field2; // final은 값을 바꿀수 없다. 생성자에서 초기화선언이 가능하다.
	}

	
	//Method
	
	
	//Main Method
	
	public static void main(String[] args)
	{
		Calculator3 ca1 = new Calculator3(5);
		Calculator3 ca2 = new Calculator3(7);
	}
}
