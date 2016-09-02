package ch11.exam03;

public class Example {

	public static void main(String[] args) {
		Date d1 = new Date();
		String d1str = d1.toString();
		System.out.println(d1str);
		System.out.println(d1);
		String result = d1+"맑음";
		System.out.println(result);
		
		java.util.Date d2 = new java.util.Date();
		String d2str = d2.toString();
		System.out.println(d2str);
	}

}
