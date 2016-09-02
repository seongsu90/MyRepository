package ch11.exam08;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		//Class classCar = Car.class; //로딩이 된 클래스를 가져온다
		
		//Class classCar = Class.forName("ch11.exam08.Car"); //로딩이 안된 클래스도 확인한다.
		
		Car car = new Car();
		Class classCar = car.getClass();
		
		System.out.println(classCar.getName());
		System.out.println(classCar.getSimpleName());
		System.out.println(classCar.getPackage().getName());
	}

}
