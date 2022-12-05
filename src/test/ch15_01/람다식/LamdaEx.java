package test.ch15_01.람다식;

public class LamdaEx {

	public static void main(String[] args) {
	
//		action(new Calculable() { // 하위클래스선언과 동시에 오버라이드
//
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println(x+y);
//				
//			}
//			
//		});

		//람다식 : 함수 처리내용을 다르게 할 수 있다
		//인터페이스를 보고 생성
		//람다를 쓰는 이유? : 코드가 줄어들음
		// 익명구현객체를 람다식으로 표현 하려면 인터페이스가 단 하나의 추상 메소드만 가져야한다.
		// 실행문이 하나라면 중괄호를 생략하고 생성가능
//		action((x,y) -> 
//			//오버라이드 된 메서드랑 같음
//			System.out.println(x + y)
//		);
//		
//		action((x,y) -> {
//			//오버라이드 된 메서드랑 같음
//			System.out.println(x - y);
//		});
		
		
		//매개변수가 하나일때 괄호도 생략가능
	action(x -> {
			//오버라이드 된 메서드랑 같음
			System.out.println(x);
		});
		
		
	}
	
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		
		calculable.calculate(x);
	}
}
