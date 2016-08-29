package ch07.exam02;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model,String color,int channel)
	{
		super(model,color); //부모생성자를 의미한다. 부모생성자에 매개변수가 필요하면 그 값도 넣어줘야 한다.
		this.channel=channel;
	}//인스턴스 메소드 혹은 생성자에서 쓸수 있다.
	
	void turnOnDmb()
	{
		System.out.println("채널 "+channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel)
	{
		this.channel=channel;
		System.out.println("채널 "+channel +"번으로 바꿉니다.");
	}
	void turnOffDmb()
	{
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
