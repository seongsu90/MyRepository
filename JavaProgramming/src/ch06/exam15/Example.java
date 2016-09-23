package ch06.exam15;

//*는 이 패키지않에 있는 모든 클래스파일 사용
import ch06.exam15.pack1.A;
import ch06.exam15.pack2.B;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A(); 에러가 난 이유는 같은 패키지 안에 A가 있는게 아니다.
		A a = new A();
		B b = new B();
		ch06.exam15.pack1.C c = new ch06.exam15.pack1.C();
	}

}
