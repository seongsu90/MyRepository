package ch06.exam12;

public class StaticMember2 {

	
		//static field
		static String field;
		String field2;
		//static block
		static{
			System.out.println("Static Block 실행");
			field = "자바";
			//field2 = "자바"; 객체가 없기 때문에 사용될수 없다.
		} // static 블록이다. static 필드를 초기화한다.
		//static 블록안에서는 메소드를 호출 할수 있다.
		
		//static Method
		static void method()
		{
			//field2="자바"; field2는 객체가 있어야 실행되기 때문에 사용불가
		}
		
		void method2(){
			
			field="자바";
			field2="자바";
		}
		
		public static void main(String[] args) //메인 메소드는 클래스 멤버라고 보기 어렵다.
		{
			field="자바";
			method();
			
			StaticMember2 sm = new StaticMember2();
			sm.field2="자바";
			sm.method2();
		}
}
