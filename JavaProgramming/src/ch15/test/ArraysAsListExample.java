package ch15.test;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","신용권","감자바");
		for(String name : list)
		{
			System.out.println(name);
		}
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(3,2,1);
		for(int value : list2)
		{
			System.out.println(value);
		}

	}

}
