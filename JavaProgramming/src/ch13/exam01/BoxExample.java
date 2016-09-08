package ch13.exam01;

import java.util.Date;

public class BoxExample { 
	

	public static void main(String[] args) {
		Box box1 = new Box();
		
		box1.setItem("홀길동");
		String name = (String)box1.getItem();
		System.out.println(name);
		
		Box box2 = new Box();
		box2.setItem(10);
		int value = (Integer)box2.getItem();
		System.out.println(value);
		
		Box box3 = new Box();
		box3.setItem(new Date());
		Date date = (Date)box3.getItem();
		System.out.println(date);
	}

}
