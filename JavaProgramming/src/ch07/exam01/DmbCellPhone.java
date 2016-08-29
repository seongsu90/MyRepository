package ch07.exam01;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model,String color,int channel)
	{
		this.model = model; // this. 대신 super 를 써도 된다. 부모를 나타낸다.
		super.color= color;
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
