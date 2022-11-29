package test.ch11.Math;

import java.util.Random;

public class 랜덤클래스 {

	public static void main(String[] args) {
		//자바 유틸 패키지의 랜덤 클래스
		Random rand = new Random();
		
		for (int i = 0; i <=5; i++) {
			//nextInt(n) 인트 타입의 변수를 리턴 (0<= ~ <n)
 			System.out.print(rand.nextInt(10) + ",");
		}
		
		System.out.println("=========================");
		// seed : 랜덤한 숫자가 맞지만 계속 같은 숫자를 리턴해줌	
		// 시드를 만드는 이유 컴퓨터 자체가 난수를 생성할 수 없기에
		// 시드를 통해서 난수를 만드는 알고리즘을 사용
		Random rand2 = new Random(100); //seed를 넣어줌
		
		for(int i = 0; i <=5; i++) {
			System.out.print(rand2.nextInt(10) + " , ");
		}

	}

}
