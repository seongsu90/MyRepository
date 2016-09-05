package ch11.exam10;

import java.util.StringTokenizer;

public class StringSplitStringTokenizer {

	public static void main(String[] args) {
		 String data = "홍길동,이수홍,박연수,감자바,최명호";
		 //                 문자열 하나하나를 토큰이라고 한다. Token
		 String[] dataArray = data.split(",");
		 System.out.println(dataArray.length);
		 
		 for(String name :dataArray)
		 {
			 System.out.println(name);
		 }
		 
		 
		 StringTokenizer st = new StringTokenizer(data,",");
		 System.out.println(st.countTokens());
		 
		 while(st.hasMoreTokens()) //토큰이 있냐 없냐만 묻는 메소드다
		 {
			 String name = st.nextToken();
			 System.out.println(name);
		 }
		 
		 System.out.println("---------------------------------");
		 data = "홍길동&이수홍,박연수,감자바-최명호";
		 //                 문자열 하나하나를 토큰이라고 한다. Token
		 dataArray = data.split("&|,|-");
		 		 
		 for(String name :dataArray)
		 {
			 System.out.println(name);
		 }
	}

}
