package test.ch07;

public class Computer extends Calculater{

	// 오버라이드 부모의 메서드가 자식클래스에서 맞지 않을떄 메소드를 재정의(반환형, 메소드 이름 , 매개변수가 다 같아야함)
	// 마우스 왼쪽 클랙 소스 - 오버라이드
	// 없다고 문제는 없지만 컴파일 할떄 확인함
	@Override
	public double areaCircle(double r) {
		// super 상위 클래스에서 뭐 가져옴
		System.out.println("computer 객체에 areaCircle 메소드 실행");
		return Math.PI * r * r ;
	}
	

}
