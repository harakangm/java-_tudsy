package test.ch04;

public class 반복문 {

	public static void main(String[] args) {
		
		//반복문의 누적합산
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum= " + sum);
		
		
//		int j = 0;
//		//자바에서는 조건식 하고 증감자를 두개씩 쓸 수있다 대신 증감식은 하나만 써야함
//		for (int i = 1; i <= 10 && j<=10; i++, j++) {
//			System.out.println(i);
//			System.out.println(j);
//		}

		//부동소수점 찍으면 이상한 값이 나옴
		for(float x = 0.1f; x<1.0f; x+=0.1f) {
			System.out.println(x);			
		}
		
		
		//이중 for문
		
		for (int m=2; m<=9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n = 1; n<=9; n++) {
				System.out.println(m + "X" + n + "=" + (m*n));				
			}
		}
		
		
	}

}
