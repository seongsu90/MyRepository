package ch13.exam07;

public class Example {
	public static void main(String[] args)
	{
		int r1=Util.compare(10, 20);
		int r2=Util.compare(20.5,10);
		int r3=Util.compare(new Integer(10), 20);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}
