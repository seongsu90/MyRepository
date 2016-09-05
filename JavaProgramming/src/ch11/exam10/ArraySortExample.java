package ch11.exam10;

import java.util.Arrays;

public class ArraySortExample {

	public static void main(String[] args) {
		int[] scores = {99,97,98};
		
		Arrays.sort(scores);//올림차수 정렬 ,배열항목배열 (기본타입)
		
		System.out.println(Arrays.toString(scores));
		
		
		Member2[] members = { //배열항목배열 (멤버나 객체일경우 compareTo 필요)
				new Member2("홍길동",99),
				new Member2("박동수",97),
				new Member2("김민수",98)
				
		};
		
		Arrays.sort(members); //객체 비교시 compareTo를 정렬해야된다.
		
		System.out.println(Arrays.toString(members));
		
	}

}


class Member2 implements Comparable // 비교문 만들때 꼭 선언하자
{
	String name;
	int score;
	
	Member2(String name, int score)
	{
		this.name = name;
		this.score=score;
	}
	@Override
	public int compareTo(Object o) { //객체비교를 해서 음수가 나오면 앞으로 나온다. 0이면 같다. 양수면 뒤에 배치된다.
		System.out.println("compareTo");
		Member2 target = (Member2) o;
		
		return score-target.score; //target.compareTo(name) 도 같은 결과다
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+score;
	}
}