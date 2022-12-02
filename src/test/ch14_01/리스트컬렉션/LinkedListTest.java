package test.ch14_01.리스트컬렉션;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		//LinkedList 수정삭제를 많이해야하는 작업을 할때는 시간이 단축이 된다
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i ++) {
			list1.add(0, String.valueOf(i)); //0번 인덱스 값이 계속 수정됨
		}
		
		//끝나는 시간
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime) );

		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i ++) {
			list2.add(0, String.valueOf(i));
		}
		
		//끝나는 시간
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime) );
	}

}
