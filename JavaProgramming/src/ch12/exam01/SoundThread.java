package ch12.exam01;

import java.awt.Toolkit;

public class SoundThread extends Thread{ // 반드시 run()을 재정의 해야된다.
	//field
	
	//Constructor
	public SoundThread()
	{
		setName("SoundThread");
	}
	//method
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++)
		{
			toolkit.beep();
			System.out.println("소리: "+Thread.currentThread().getName());
			try{Thread.sleep(500);} catch(Exception e){}
		}
	
	}
}
