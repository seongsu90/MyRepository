package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		
		//Instance Member 사용
		InstanceMember im=new InstanceMember();
		im.field="자바";
		im.method();
		System.out.println(im.field);
		
		//Static Member 사용
		//StaticMember.field = "자바";
		//StaticMember.method();
		//StaticMember sm =null; 이떄는 실행이 안된다.
		//StaticMember sm = new StaticMember();
		// 적재가 될때만 실행된다.
		//적재시점은 클래스가 사용되는 시점이다. 멤버나 생성자가 호출/실행되는 시점
		System.out.println(StaticMember.field);
		StaticMember.method();
	}

}
