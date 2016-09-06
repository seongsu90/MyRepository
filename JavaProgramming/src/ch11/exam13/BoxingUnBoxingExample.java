package ch11.exam13;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj = 100; // Integer 객체에 100이라는 값을 박싱하고 obj에 객체주소값을 저장
		
		int value =obj; // 번지 값에 있는 객체의 값을 꺼내서(언박싱) 그 값을 value에 저장
		
		System.out.println(value);
		
		int result = obj + 200;
		System.out.println(result);
		
		

	}

}
