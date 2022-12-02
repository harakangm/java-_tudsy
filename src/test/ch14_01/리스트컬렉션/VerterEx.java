package test.ch14_01.리스트컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VerterEx {

	public static void main(String[] args) {
//		List<Board> list2 = new Vector<Board>(); //자동형변환 List는 vector의 부모 인터페이스

		// 제너릭이라서 클래스하고 인터페이스명만 사용가능
		//벡터는 동기화가 적용이됨
//		Vector<Board> list = new Vector<Board>();
		ArrayList<Board> list = new ArrayList<Board>();

		Thread thredA = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
			
		};

		Thread thredB = new Thread() {
			@Override
			public void run() {
				for(int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
					
				}
			}
			
		};
		//쓰레드 실행
		thredA.start();
		thredB.start();
		
		//작업 스레드들이 모두 종료 될 때 까지 메인 스레드를 기다리게 하는 코드
		
		try {
			thredA.join(); //메인스레드가 다 돌아갈때까지 기다림
			thredB.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//join이 없으면 메인스레드가 먼져 실행되서 0이 찍힘
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		

	}

}
