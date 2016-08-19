package ch04.exam02;

public class WhileExample3 {

	public static void main(String[] args) throws Exception{
		
			
		while(true)
		{
			
			int num = System.in.read(); // 키보드에 입력한 키코드(번호)를 저장	
			if(num !=13 && num !=10)
			{
				System.out.println(num);
				
			}
			
		}
	}

}
