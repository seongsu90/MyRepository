package ch11.exam11;

import java.util.Arrays;

public class ArraySortExample { //ClassCastException 은 클래스 타입변환 에러

	public static void main(String[] args) {
		Board[] boardArr = {
				new Board(3,"오늘은 화요일"),
				new Board(1,"다음주는 추석"),
				new Board(5,"과제가 있을까?"),
		};
		
		Arrays.sort(boardArr);
		
		System.out.println(Arrays.toString(boardArr));

	}

}
