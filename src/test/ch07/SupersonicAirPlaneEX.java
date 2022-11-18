package test.ch07;

public class SupersonicAirPlaneEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SupersonicAirPlane오버라이드 sa = new SupersonicAirPlane오버라이드();
		// 부모클래스안에 필드를 실행시킴
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirPlane오버라이드.SUPERSONIC;
		sa.fly();
	}

}
