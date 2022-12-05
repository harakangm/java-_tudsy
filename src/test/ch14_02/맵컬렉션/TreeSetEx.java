package test.ch14_02.맵컬렉션;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		//TreeSet 정렬에 적합함
		//이중트리 구조로 저장이됨
		//맨 처음 루트의 값과 비교해서 작은건 왼쪽 큰건 오른쪽
		TreeSet<Integer> scores = new TreeSet<>();
		
		//데이터 추가
		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);
		
		for(Integer s :scores) {
			System.out.println(s + ""); //자동으로 정렬이 된다.(오름차순)
		}
		//first() 메서드 가장 아래있는 낮은 값을 리턴해줌
		System.out.println("가장 낮은 값 :" + scores.first());
		// last() 메서드 가장 높은 값을 찍어줌
		System.out.println("가장 높은 값 :" + scores.last());
		
		System.out.println("5보다 작은 값 :" + scores.lower(5));
		System.out.println("5보다 큰 값 :" + scores.higher(5));
		
		//기본적인 오름차순이 아닌 내림차순으로 표현
		//NavigableSet클래스를 이용
		NavigableSet<Integer> desc = scores.descendingSet();
		for (Integer s : desc) {
			System.out.println(s + " ");
		}
		
		//범위 검색 (5 <= score) 5보다 크거나 같은 범위
		//tailSet(주어진 값, boolean) : 주어진 값도 높은 값을 가져온다.
		//boolean값은 해당 값을 포함하는지 않하는지에 대한 값 true 포함 false 포함안함
		NavigableSet<Integer> rangeSet = scores.tailSet(5, true);
		for (Integer s : rangeSet) {
			
			System.out.print(s + " ");
		}
		System.out.println("-----------------------------");
		//범위 검색 (4 <= score <9)
		//true 포함 false 포함안함
		rangeSet = scores.subSet(4, true, 9, false);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
	}

}
