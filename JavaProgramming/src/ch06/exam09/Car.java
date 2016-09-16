package ch06.exam09;

public class Car {
	
	//field
	int gas;
	
	//Constructor
	
	//Method
	void setGas(int gas)
	{
		this.gas = gas;
	}
	
	boolean isLeftGas()
	{
		if(gas==0)
		{
			System.out.println("gas가 없습니다.");
			return false;
		}
		else{
			System.out.println("gas가 있습니다.");
			return true;
		}
		
	}
	
	void run() throws InterruptedException 
	{
		while(true)
		{
			if(gas>0)
			{
				System.out.println("멈춥니다.(gas 잔량: " + gas+")");
				gas -= 1;
				Thread.sleep(1000);
			}
			else
			{
				//break; 는 while 문을 빠져나가서 while이후의 코드를 이용할 수 있다.
				System.out.println("멈춥니다.(gas 잔량: " + gas+")");
				return; //값을 지정하면 안된다. 의미는 리턴값은 없지만 여기서 메소드를 끝내겠다라는 의미
			}
		}
	}
}
