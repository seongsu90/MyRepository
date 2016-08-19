package ch04.exam03;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주사위의 눈이 6이 나오면 프로그램을 종료하세요
		
		
		
		while(true)
		{
			int value = (int) (Math.random()*6) +1;
			/*double num = Math.random();
			num = num*6;
			int value = (int)num;
			value +=1;*/
			System.out.println(value);
			
			if(value==6)
			{
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
