package ch06.exam12;

public class StaticMember {

	
		//static field
		static String field;
		//static block
		static{
			System.out.println("Static Block 실행");
			field = "자바";
		} // static 블록이다. static 필드를 초기화한다.
		
		//static Method
		static void method()
		{
			
		}
}
