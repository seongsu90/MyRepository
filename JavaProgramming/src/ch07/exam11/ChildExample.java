package ch07.exam11;

public class ChildExample {
	public static void main(String[] args)
	{
		/*Parent parent = new Parent();
		
		Child child = (Child) parent;*/ //이경우 캐스팅exception 이 발생한다.
		
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*parent.field2 = "data2";
		parent.method3();*/
		
		Child child = (Child) parent;
		child.field2="yyy";
		child.method3();
	}
}
