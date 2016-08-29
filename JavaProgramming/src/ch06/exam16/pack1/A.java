package ch06.exam16.pack1;

public class A { // 클래스 멤버라면 다 붙일수 있다. public, private, protected 등등 
	//클래스 앞에는 private는 안된다.
	

	//field
	private int field1;
	int field2; // 같은 패키지에서 사용가능
	public int field3; // 모든곳에 사용가능, 패키지가 달라도 사용가능
	//Constructor
	private A(){} // 오버로딩에 유의하자, private 클래스 안에서만 쓴다.
	A (int field1) {}
	public A(int field1, int field2){}
	
	//Method
	
	private void method1(){}
	void method2(){}
	public void method3(){}
	
}
