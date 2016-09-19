package ch15.exam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		//Map map = new HashMap(); // 이런상태는 키와 값이 모두 오브젝트타입이다.
		
		//Map 계열 컬렉션 생성
		Map<String,Integer> map = new HashMap<>();
		
		//엔트리 추가
		map.put("홍길동", 85); //85의경우 AutoBoxing 이 된다. , 뒤에 String이 같기때문에 덮어씌워져 85대신 95가 된다.
		map.put("추가을", 90);
		map.put("홍길동", 95);
		map.put("감자바", 81);
		System.out.println(map.size());
		System.out.println();
		
		//객체(값) 얻기
		int score = map.get("홍길동");
		System.out.println(score);
		System.out.println();
		
		//모든 엔트리 일괄 처리
		Set<Entry<String,Integer>> set = map.entrySet();
		
		for(Map.Entry<String, Integer> me : set)
		{
			String key = me.getKey();
			int value = me.getValue();
			System.out.println(key + ": "+value);
		}
		System.out.println();
		
		Set<String> set2 = map.keySet();
		for(String key : set2)
		{
			int value = map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		
		Set<String> set3 = map.keySet();
		for(String key : set3)
		{
			int value = map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println();
	}

}
