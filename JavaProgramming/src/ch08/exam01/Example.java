package ch08.exam01;

public class Example {
	
	public static void powerOn(RemoteControl rc) //인터페이스로 사용가능한 객체가 들어온다.
	{
		rc.turnOn();
	}

	public static void main(String[] args) {
		
		int max =RemoteControl.MAX_VOLUME;
		int min =RemoteControl.MIN_VOLUME;
		// 인터페이스의 상수는 매개값으로 자주 쓰인다.
		
		/*RemoteControl.turnOn();
		RemoteControl.turnOff();
		RemoteControl.setVolume(5);*/
		
		//RemoteControl.setMute(true); 객체가 없으면 사용할 수 없다.
		
		RemoteControl.changeBattery();
		
		
		//------------------------------------
		
		Television tv = new Television(); //텔레비전으로 조작
		
		
		tv.turnOn();
		
		RemoteControl rc = tv;	//리모콘으로 tv를 사용한 소스 , 인터페이스 이용
		
		rc.turnOn();
		
		Audio audio = new Audio();
		rc = audio;
		rc.turnOn();
		
		//-----------------------------------
		
		powerOn(new Television());
		powerOn(new Audio());
}
}