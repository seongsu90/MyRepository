package ch12.exam10;

public class PrintThread3 extends Thread{
		
	@Override
	public void run() {
		try{
		while(true){
			System.out.println("실행 중...");
			if(Thread.interrupted())///if(isInterrupted())
			{
				break;
			}
		}
		}catch(Exception e){}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
}
