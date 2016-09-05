package ch11.exam10;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject ="자바 프로그래밍";
		
		boolean result1 = subject.contains("자바");
		
		if(result1)
		{
			System.out.println("자바 관련 책이군요");
		}else
		{
			System.out.println("자바 관련없는 책이군요");
		}
		
		
		
		int result2 = subject.indexOf("자바");
		
		if(result2 !=-1)
		{
			System.out.println("자바 관련 책이군요");
		}else
		{
			System.out.println("자바 관련없는 책이군요");
		}
		
		int startIndex = subject.indexOf("자바");
		int endIndex = startIndex+2;
		String token1 = subject.substring(startIndex,endIndex);
		System.out.println(token1);
		
		String find = "프로그래밍";
		startIndex=subject.indexOf(find);
		endIndex =  startIndex + find.length();//startIndex+5;
		
		//String token2 = subject.substring(startIndex, endIndex);
		String token2 = subject.substring(startIndex);
		System.out.println(token2);

	}

}
