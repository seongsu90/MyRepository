package ch04.exam01;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("프로그램 시작");
		int score = 70;
						
		if(score >90)
		{
			if(score >=95)
			{
				System.out.println("A+등급");
			}else
				System.out.println("A등급");
		}
		else if(score > 80)
		{
			System.out.println("B등급");
		}
		else
		{
			System.out.println("기타 등급");
		}
		
		
		System.out.println("프로그램 종료");
	}

}
