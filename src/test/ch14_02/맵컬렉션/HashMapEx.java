package test.ch14_02.맵컬렉션;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
  //맵 컬렉션의 hashMap 클래스는 <key, 실제 들어갈 값(객체)>가 들어간다
		//hashMap은 키 값과 객체 값이 같이 저장된다
	
//		Map<> hashmap = new HashMap<>();
		//스트링타입이 키 값과 인티져 타입의 값을 저장함
		HashMap<String, Integer> hashmap = new HashMap<>();
		
				// key , 값
		hashmap.put("강하라", 95);
		hashmap.put("김명현", 90);
		hashmap.put("양준수", 97);
		hashmap.put("노은비", 91);
		
		System.out.println("총 Entry 수 :" + hashmap.size());
		
		//키로 값 얻기
		String key = "강하라";
		int value = hashmap.get(key);
		System.out.println("점수 : " + value);
	}

}
