package ch07.exam06.pack2;

import ch07.exam06.pack1.A;

public class D extends A {
	
		//Field
		/*A a = new A();*/ //상속과 관련이 없기 때문에 정의가 안된다.
		// Constructor
		D()
		{
			/*A a = new A();*///상속과 관련이 없기 때문에 정의가 안된다.
			super();
			field =5;
			method();
		}
	
		//Method
		void method2()
		{
			/*A a = new A();*///상속과 관련이 없기 때문에 정의가 안된다.
		}
}
