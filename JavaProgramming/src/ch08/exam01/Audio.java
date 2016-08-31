package ch08.exam01;

public class Audio implements RemoteControl{ //리모트컨트롤을 구현한 오디오 클래스 //> 오디오는 리모트콘트롤로 사용가능하게 한다.
	

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("현재 Audio 볼륨: "+volume);
		
	}
	
}
