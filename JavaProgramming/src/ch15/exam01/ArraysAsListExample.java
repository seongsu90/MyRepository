package ch15.exam01;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","JDBC","Database");
		System.out.println(list.size());
		
		for(String str : list)
		{
			System.out.println(str);
		}
		
		//list.add("SQL"); Arrays는 객체 내부에 배열을 만들기 때문에 길이 추가 삭제가 안된다. 고정된 항목만 가능
		//list.remove(1);
		
		
	}

}
