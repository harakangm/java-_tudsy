package test.ch11.Math;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		//선택번호(내가 선택한 번호)
		int[] SelcetNumber = new int[6]; //로또번호 6개가 저장될 배열
		Random random = new Random(3);
		System.out.println("선택번호: ");
		
		//랜덤 숫자 6개를 생성을 해서 배열에 넣어줌;
		for(int i = 0; i < 6; i++) {
			SelcetNumber[i] = random.nextInt(45) + 1; // 1~45범위의 숫자로 만든다.
			System.out.println(SelcetNumber[i] + " ");
		}
		System.out.println("===============================");
		//당첨번호(컴퓨터에서 주는 번호)
		int[] winNumber = new int[6]; //당첨번호 6개가 저장될 배열
		Random random2 = new Random(5);
		System.out.println("당첨번호: ");
		
		//랜덤 숫자 6개를 생성을 해서 배열에 넣어줌;
		for(int i = 0; i < 6; i++) {
			winNumber[i] = random2.nextInt(45) + 1; // 1~45범위의 숫자로 만든다.
			System.out.println(winNumber[i] + " ");
		}
		System.out.println("===============================");
		//당첨여부
		Arrays.sort(SelcetNumber); // 비교하기 전에 배열 값을 정렬: 배열 내부의 값들이 정렬된 상태로 바뀐다.
		Arrays.sort(winNumber);   
		
		boolean result = Arrays.equals(SelcetNumber, winNumber); // 배열 값들이 같은지 비교
		
		if(result == true) {
			System.out.println("당첨입니다");
		}
		System.out.println("당첨이 아닙니다");
		
	}

}
