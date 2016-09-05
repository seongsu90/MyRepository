package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class ByteToStringExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = {72, 101, 108, 108,111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);

		
		//-------------------------------------------------------
		String str3 ="홍길동";
		byte[] strBytes3 = str3.getBytes();
		
		String str4 = new String(strBytes3);
		System.out.println(str4);
		
		String str5 ="홍길동";
		byte[] strBytes5 = str5.getBytes(); //문자열을 바이트화는 인코딩이라고 한다.
		String str6 = new String(strBytes5,"UTF-8"); // 바이트 배열을 문자열로 전환하는 과정을 디코딩이라고 한다.
		System.out.println(str6);
		/*String str7 = new String(strBytes5,2,9,"UTF-8"); // 배열의 인덱스라기 보다 바이트수가 범위라고 생각하자.
		System.out.println(str7);*/
	}

}
