package test.ch04;

public class 반복문while {

	public static void main(String[] args) {
		
		// while안에 값이 참이면 실행
		int i = 1;
		
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
		//while문으로 다중합산
		int num = 0;
		
		while(i <=100) {
			num += i;
			i++;
		}
		
		System.out.println(num);
		
		//do while문
		// 실행먼저하고 while에서 true false를 찾음
		do {
			i++;
			System.out.println(i);
		} while( i <= 10);
		
	}

}
