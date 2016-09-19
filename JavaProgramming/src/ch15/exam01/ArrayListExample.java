package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// List 계열의 컬렉션 생성
		List<String> list = new ArrayList<>(); //뒤에 제네릭타입은 생략해도 된다.
		//List<String> list = new Vector<>(); // Vector가 와도 List 인터페이스를 사용하기 때문에 코드 수정을 안해도 된다.
		//List<String> list = new LinkedList<>(); 도 사용가능하다.
		
		//객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBatis");
		
		//저장된 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수 : "+size);
		System.out.println();
		
		//객체찾기
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println();
		
		//전체 객체를 일괄 처리
		for(int i =0; i<list.size();i++)
		{
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println();
		
		for(String str : list) //  ... : ..... 에서 뒤에 부분은 배열,혹은 Iterable<E> 가 구현되있을 때 향상된 포문을 사용할 수 있다.
		{
			System.out.println(str);
		}
		System.out.println();
		
		//객체 삭제
		list.remove(2);
		list.remove(2);
		list.remove("iBatis"); //string의 equals 문을 사용하기 때문에 값을 비교하고 지운다.
		System.out.println(list.size());
		
	}

}
