package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Thread thread = new SoundThread(); // 스레드를 상속 시켜서 실행 //SoundThread thread 로 선언해도 된다.
			thread.start();
	
		for(int i=0;i<5;i++)
		{
			System.out.println("띵");
			System.out.println("출력: "+Thread.currentThread().getName());
			try{Thread.sleep(500);} catch(Exception e){}
		}

	}

}
