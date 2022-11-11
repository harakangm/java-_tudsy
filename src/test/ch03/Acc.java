package test.ch03;

public class Acc {

	public static void main(String[] args) {
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		
//		//자바에서는 정확한 연산은 항상 정수로 해야한다!
//		double result = apple - number * pieceUnit;	
//		System.out.println("사과 1개에서 남은 양 : " + result);

		/*
		 * int apple = 1; int totalpiece = apple * 10; int number = 7;
		 * 
		 * //자바에서는 정확한 연산은 항상 정수로 해야한다! int result = totalpiece - number;
		 * System.out.println("사과 1개에서 남은 양 : " + result/10.0);
		 */

		// 0으로 나누면 무한대 에러가남
		int x = 5;
		double y = 0.0;
//		double z = x / y;
		double z = x % y;

		System.out.println(z + 2);
		// 여기서의 Double은 객체 isInfinite 이 값이 무한이냐?
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z);
		}
	}

}
