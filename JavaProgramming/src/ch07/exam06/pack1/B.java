package ch07.exam06.pack1;

public class B {
	//Field
	A a = new A();
	//Constructor
	B()
	{
		A a = new A();//로컬변수
		a.field=10;
		a.method();
	}
	//Method
	void method()
	{
		A a = new A();
	}
}
