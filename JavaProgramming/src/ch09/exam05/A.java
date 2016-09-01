package ch09.exam05;

public class A {
	int field =10;
	static int field2 =5;
	
	public static class B
	{
		int field1;
		static int field2;
		void method1(){ //A객체가 없어도 실행될 내용이 들어가야 된다. B가 static이라서..
		//field =3;
		
		}
		static void method2()
		{
			
		}
		
	}
}
