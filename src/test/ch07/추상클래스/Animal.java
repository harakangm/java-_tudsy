package test.ch07.추상클래스;
    // 추상클래스 : 상속을 하기 위해 만든 클래스
public abstract class Animal {
	// 일반 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	//추상 메소드 선언  abstract붙임
	// 안에 코드를 적을 수 없다
	// 추상 메소드는 자식클래스에서 반드시 오버라이딩이 되어야 한다.
	public abstract void sound();
}
