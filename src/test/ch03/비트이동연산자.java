package test.ch03;

public class 비트이동연산자 {

	public static void main(String[] args) {
			
			//좌측 이동 연산자
			// 2의 거듭제곱을 곱한 결과와 같다.
			int num1 = 1;
			int result1 = num1 << 3;
			System.out.println(result1);
			
			//우측으로 밀고 남은 공간은 최상의 기호와 같이 바꿈
			// 2의 거듭제곡을 나눈 결과와 같다.
			int num2 = -8;
			int result3 = num2 >> 3;
			System.out.println(result3);
			
			// >>> 나머지 부호비트를 무족건 0으로 채움

	}

}
