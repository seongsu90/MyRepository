package ch06.exam08;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math = new Math();
		math.printInfo("수학 객체가 생성됨");
		
		int result =math.max(7, 5);
		System.out.println(result);
		
		math.max(5, 8);
		
		int[] values = {10,20,30,40,50}; // 배열의 조건 : 똑같은 타입을 사용해야된다.
		double avg= math.avg1(values); // 리턴값이 double 이기 때문에 avg 타입을 double로 해야된다.
		
		double result1 = math.avg1(values);
		
		System.out.println(result1);
		
		double result2= math.avg2(10,20,30,40,50);
		System.out.println(result2);
	}

}
