package ch12.exam13;

public class ThreadGroupExample {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		
		for(int i=0;i<10;i++){
			int count = i;
		Thread thread2 = new Thread(){ //익명객체안에서 로컬변수를 쓰면 파이널 특성이다.
			@Override
			public void run() {
				while(true)
				{
					System.out.println("Thread"+count+" 실행중...");
					if(isInterrupted()) break;
				}
				System.out.println("Thread"+count+" 종료");
			
			}
		}; //익명자식객체
		
		thread2.start();
		}
		ThreadGroup mainGroup = thread.getThreadGroup();
		System.out.println(mainGroup.getName());
		System.out.println(mainGroup.activeCount());
		
		try {Thread.sleep(500);} catch (InterruptedException e) {}
		mainGroup.interrupt();
		
	}

}
