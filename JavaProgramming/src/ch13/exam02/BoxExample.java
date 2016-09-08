package ch13.exam02;

import java.util.Date;

public class BoxExample {
//제네릭 지정을 했는데 설정을 안하면 object으로 컴파일한다.
	public static void main(String[] args) {
		Box<String> box1 = new Box<>(); //뒷 제네릭은 안써도 된다.
		
		box1.setItem("홀길동");
		String name = box1.getItem();
		System.out.println(name);
		
		Box<Integer> box2 = new Box<>();
		box2.setItem(10);
		int value = box2.getItem();
		System.out.println(value);
		
		Box<Date> box3 = new Box<>();
		box3.setItem(new Date());
		Date date = box3.getItem();
		System.out.println(date);
	}

}
