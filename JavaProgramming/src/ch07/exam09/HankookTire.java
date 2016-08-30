package ch07.exam09;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation)
	{
		super(location, maxRotation);
	}
	
	@Override //오버라이딩이 제대로 되는지 검사한다. 어노테이션 //컴파일러가 재정의가 잘됬는지 확인
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation)
		{
			System.out.println(location + " HankookTire 수명: " + (maxRotation-accumulatedRotation)+ "회");
			return true;
		}
		else
		{
			System.out.println("***"+ location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
