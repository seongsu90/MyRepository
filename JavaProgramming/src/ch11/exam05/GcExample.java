package ch11.exam05;

public class GcExample {

	public static void main(String[] args) {
		Employee emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
				
		System.gc(); // garbage collecter 쓰레기 객체 제거, 시스템이 한가하거나 메모리가 가득차면 진행
		
	}

}
