package ch12.exam08;

public class ThreadA extends Thread{
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) //주입 : Injection , 생성자 주입이다.
	{
		this.workObject = workObject;
	}
	
	
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			workObject.methodA();
		}
	
	}
}
