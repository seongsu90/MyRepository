package ch08.exam03;

public interface RemoteControl {
	
	//Constant
	int MAX_VOLUME = 10; // public static final 이 생략되있다.
	int MIN_VOLUME=1;
	
	//Abstract Method
	
	 void turnOn();	//추상 메소드다. public abstract 가 생략되있다. 반드시 객체가 있어야 된다.
	 void turnOff();
	 void setVolume(int volume);
	//Default Method
	default public void setMute(boolean mute) { //중괄호가 있으면 실행하는 문이다. //인터페이스만 가지고 실행이 안된다.
		if(mute)
		{
			System.out.println("무음 처리합니다.");
		}
		else
		{
			System.out.println("무음 해제합니다.");
		}
	}
	//Static Method
	public static void changeBattery()
	{
		System.out.println("건전지를 교환합니다.");
	}
	
}
