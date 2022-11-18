package test.ch07;
//초음속
public class SupersonicAirPlane오버라이드 extends Airplane오버라이드{
	//상수 static final	
	public static final int NOMAL = 1; 
	public static final int SUPERSONIC = 2; 
	
	// 상태 필드 선언 안에 상수로 선언한 노말을 넣어줌
	public int flyMode = NOMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다");
		} else { //normal일떄는
			//super 상위클래스를 나타냄
			//오버라이드 한게 우선순위가 높기때문에 먼저실행됨
			//근대 super가 있어서 먼저 부모클래스에 있는 메소드를 실행함
			super.fly(); 			
		}
	}
	
	
}
