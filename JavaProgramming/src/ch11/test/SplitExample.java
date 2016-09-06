package ch11.test;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		String[] text = str.split(",");
		
		for(String str2 : text)
		{
			System.out.println(str2);
		}
		System.out.println();

		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens())
		{
			String a = st.nextToken();
			System.out.println(a);
		}
	}

}
