package ch13.exam08;

public class TextendsExample {

	public void method1(C1<Integer> arg){}
	public void method2(C1<? extends Number> arg){}
	public C1<? extends Number> method3(){return null;}

}


class C1<T>{}
class C2<T extends Number>{}
class C3{
	public <T> void mothod(T t){} // 타입 파라미터를 새로 선언하는것이다.
	public <T extends Number> void method(T t){}
}

