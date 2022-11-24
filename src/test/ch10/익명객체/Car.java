package test.ch10.익명객체;

public class Car {
	//필드에 Tire객체 대입
	private Tire tire1 = new Tire();
	//필드에서 익명객체(자식) 생성
	//클래스 생성
	                    //자식클래스가된다
						//자동형변환이 된
	private Tire tire2 = new Tire() { // 이름없는 클래스를 만들고 동시에 상속이됨
		@Override
		public void roll() {
			System.out.println("한국 타이어가 굴러갑니다.");
		}	
	};
	
	//메소드 
	public void run1() {
		tire1.roll();
		tire2.roll();		
	}
	
	// 메서드안에서 익명함수
	public void run2() {
		//로컬 변수에 익명 자식 객체 사용
		Tire tire =new Tire() {
			//필드도 사용가능
			@Override
			public void roll() {
				System.out.println("금호 타이어가 굴러갑니다.");
			}
		
		};
		tire.roll();
	}
	
	//메소드(매개변수 이용)
	//객체타입을 매개변수로 받아옴
	public void run3(Tire tire) {
		tire.roll();
	}
	
}
