package ch18.exam07;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) { //다양한 타입을 읽을수 없다.
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("패스워드: ");
		char[] values = console.readPassword(); //readLine 처럼 한줄을 다 읽는데 노출이 안된다.
		String password = new String(values);
		
		System.out.println("입력된 내용");
		System.out.println(id);
		System.out.println(password);
	}

}
