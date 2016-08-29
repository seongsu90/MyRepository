package ch06.exam16;

import ch06.exam16.pack1.A;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A(); 에러가 난 이유는 같은 패키지 안에 A가 있는게 아니다.
		A a = new A(3,5);
		//B b = new B();
	}

}
