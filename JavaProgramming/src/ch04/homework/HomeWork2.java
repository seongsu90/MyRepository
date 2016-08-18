package ch04.homework;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		for(int x=1;x<=10;x++) // 1<= x <= 10 를 나타내는 x의 for문
		{
			for(int y=1;y<=10;y++) // 1<=y<=10를 나타내는 y의 for문
			{
				if(4*x+5*y==60) // if조건문에서 문제의 방정식을 조건으로 두고 60의 조건에 맞을때 (x,y)를 출력
				{
					System.out.println("("+x+","+y+")"); // 조건문에 해당되는 값을 출력
				}
			}
		}
		
		
	}

}
