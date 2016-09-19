package ch15.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore =0;
		
		Set<Map.Entry<String, Integer>> me = map.entrySet();
		
		for(Map.Entry<String, Integer> me2 :  me)
		{
			totalScore+=me2.getValue();
			if(me2.getValue()>maxScore)
			{
				maxScore=me2.getValue();
				name = me2.getKey();
			}
		}
		
		System.out.println("평균점수 : "+(totalScore/me.size()));
		System.out.println("최고점수 : "+ maxScore);
		System.out.println("최고점수를 받은 아이디 : "+name);

	}

}
