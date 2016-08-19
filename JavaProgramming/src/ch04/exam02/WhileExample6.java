package ch04.exam02;

public class WhileExample6 {

	public static void main(String[] args) throws Exception {
		
		boolean run = true;
		int keyCode = 0;
		int balance =0;
		
		while(run)
		{
			if(keyCode !=13 && keyCode != 10)
			{
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.종료");
			System.out.println("--------------------------------");
			System.out.print("선택: ");
			}
			keyCode = System.in.read(); // 임시 break 포인트
			
			if(keyCode ==49)
			{
				balance += 1000;
				System.out.println("예금되었습니다." +" " +"현재 잔액 :" + balance);
			}
			else if(keyCode ==50)
			{
				balance -= 500;
				System.out.println("출금되었습니다." + "현재 잔액 :" + balance);
			}
			else if(keyCode ==51)
			{
				run = false;
				System.out.println("프로그램 종료");
			
			}
		
			
	}

	}	

}
