package ch15.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 { //hash코드로 동등객체를 확인, equals 도 포함해서.. // hash코드와 equals를 재정의 해야된다.

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		Member m1 = new Member("홍길동",25);
		Member m2 = new Member("홍길동",25);
		
		System.out.println(m1 ==m2); //번지비교 false가 나온다.
		System.out.println(m1.hashCode()==m2.hashCode());
		System.out.println(m1.equals(m2)); //object의 equals 라서 == 이랑 같다.
		
		
		set.add(m1);
		set.add(m2);
		System.out.println(set.size());
		
		

	}

}
