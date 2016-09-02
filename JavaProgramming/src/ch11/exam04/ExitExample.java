package ch11.exam04;

public class ExitExample {
	public static void main(String[] args)
	{
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				
			if(status !=5){
		
				throw new SecurityException();
			}
			System.out.println("나 죽내~");
		}
			
		}); //익명자식객체
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try
			{
			System.exit(i);
				//break;
				//return; //엄격히 말해서 프로세스가 종료되는게 아니다.
			}catch(SecurityException e){}
		}

	}
	

}
