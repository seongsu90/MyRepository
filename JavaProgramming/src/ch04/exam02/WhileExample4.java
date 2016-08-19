package ch04.exam02;

public class WhileExample4 {

	public static void main(String[] args) throws Exception{
		
			
		int num=0;
		System.out.println("프로그램 시작");
		System.out.println("숫자를 입력하세요: ");
		while(num != 113)
		{
			
			num = System.in.read(); // 키보드에 입력한 키코드(번호)를 저장	
			
			if(num !=13 && num !=10 && num !=113)
			{
				System.out.println(num);
				System.out.println("숫자를 입력하세요: ");
				
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
