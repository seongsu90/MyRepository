package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Thread thread = new Thread(){ // 스레드를 상속 시켜서 실행
			@Override
			public void run() {
				for(int i=0;i<5;i++)
				{
					toolkit.beep();
					System.out.println("소리: "+Thread.currentThread().getName());
					try{Thread.sleep(500);} catch(Exception e){}
				}
				
			}
		};
		thread.setName("SoundThread"); // 시작하기전에 이름을 바꿔야 한다.
		thread.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("띵");
			System.out.println("출력: "+Thread.currentThread().getName());
			try{Thread.sleep(500);} catch(Exception e){}
		}

	}

}
