package ch02.exam02;

public class Promotion { //public 접근제한자. void 리턴타입
	public static void main(String[] args)
	{
		byte v1 = 100;
		int v2 = v1;
		long v3 = v2;
		
		System.out.println("v3: " + v3);
		
		
		float v4 = v3;
		double v5 = v3;
		
		System.out.println("v4: " + v4);
		
		
	}
}
