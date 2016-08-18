package ch04.exam02;

public class ForExample {

	public static void main(String[] args) {
		
		int x=0;		
		
		for(int i=0;i<3;i++)
		{
			int sum = (int)(Math.random()*6) +1;
			System.out.println(sum);
			x +=sum;
			/*if (i==2)
			{
				double d = x/3.0;
				System.out.println("총합: " +x);
				System.out.println("평균: " +d);
				
			}*/
		}
		double avg = x/3.0;
		System.out.println("총합: " +x);
		System.out.println("평균: " +avg);
		
		
	}

}
