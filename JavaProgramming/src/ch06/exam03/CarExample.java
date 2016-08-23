package ch06.exam03;

public class CarExample {

	public static void main(String[] args) {
		//Car 변수 선언
		Car myCar = null;//Car 타입의 변수 myCar을 선언하고 null을 대입, 객체를 참고하고 있지않다.
		// Car 객체를 생성하고 위치 정보 얻기
		try{
			myCar = new Car();
		}catch(Exception e)
		{
			
		}//r\객체가 있는지 조사.
		
		if(myCar!=null)
		{
			System.out.println("Car 객체 있음");
		}else
		{
			System.out.println("Car 객체 없음");
		}
		
		//객체 내부의 필드값을 읽어보자.
		System.out.println(myCar.company);
		
		//객체 내부의 필드값을 변경해보자.
		myCar.company = "기아자동차";
		System.out.println(myCar.company);
		
		//객체 내부의 메소드를 호출해보자.
		myCar.run();
	}

}
