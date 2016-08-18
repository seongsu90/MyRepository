package ch04.homework;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for(int i=0; i<100;i++) // 주사위 100번을 던진다.
		{
			int diceA = (int) (Math.random()*6)+1; // 첫번째 랜덤 주사위
			int diceB = (int) (Math.random()*6)+1;// 두번째 랜덤 주사위
			if(diceA+diceB == 10) // 두 주사위의 합이 10일때 true로서 if문의 출력문이 진행
			{
				System.out.println("("+diceA+ ","+diceB+")"); // 두 주사위의 합이 10인 주사위눈의 결과문 출력
			}
		}
	}

}
