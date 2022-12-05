package test.ch14_02.맵컬렉션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapEx {

	public static void main(String[] args) {
  //맵 컬렉션의 hashMap 클래스는 <key, 실제 들어갈 값(객체)>가 들어간다
		//hashMap은 키 값과 객체 값이 같이 저장된다
	
//		Map<> HashMap = new HashMap<>();
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
		
		//해쉬맵에서 일반 배열or리스트컬렉션처럼 한꺼번에 여러개의 값을 가져오는 방법
		
		//반복해서 키와 값을 얻기
		//키를 셋타입으로 가져옴
		Set<String> keySet =  hashmap.keySet();
		//iterator() 리터레이터를 리턴해줌
		Iterator<String> keyIterator = keySet.iterator();
		//반복문 키를 뽑아옴 
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			
			Integer v = hashmap.get(k);
			System.out.println(k + ":" + v);
		}
		System.out.println("=============================");
		
		//반복해서 키와 값을 얻기 두번째 방법
		
		Set<Entry<String, Integer>> entrySet = hashmap.entrySet();
		//반복된 키값을 얻어옴 항상 키값은 이터레이터를 이용해서 얻어온다
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext() ) { // 다음 키가 있는지 찾는다.
			//엔트리 타입으로 받는다
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey(); //키를 가져옴
			Integer v = entry.getValue(); // 값을 가져옴
			System.out.println(k + ":" + v);
		}
		
		//HashMap은 비동기화 HashTable은 동기화된 메서드로 저장된다 키가 같으면 저장안됨
	}

}
