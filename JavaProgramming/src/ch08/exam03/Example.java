package ch08.exam03;

public class Example {
	
	public static void main(String[] args) {
		
		RemoteControl rc = new Television(); //rc를 가지고 텔레비전을 사용한다.
		
		rc.setMute(true); //인스턴스 메소드 이다. ,객체가 있어야 된다.
		
		rc.setVolume(200);
		
		RemoteControl.changeBattery();
	}
}