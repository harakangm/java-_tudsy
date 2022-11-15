package test.ch06;

public class calculator2 {
	
	// 인스턴스 멤버
	// static을 붙인순간 정적 멤버가됨
	// 스태틱을 붙은 애들은 run을 실행하자말자 메모리에 할당됨
	// 스태틱영역에 따로 저장이 됨
	
	
	// 1. 필드
	static double pi = 3.14159; // static을 붙이는게 전역변수
//=================================================================	
	//정적 블록: 정적필드에 대한 초기화작업이 필요하면 사용
	//클래스 안에 있지만 클래스랑 상관 없음 this 안붙임
	static String model = "calc1";
	static String number = "1";
	static String info;
	//static블록 : static 필드에 대한 초기화 작업이 필요할 떄 사용
	static {
		info = model + "_" + number; //calc1_1
	}
//=======================================================	
	// 2. 메소드
	
	static int plus (int x, int y) {
		return x + y;
	}
	
	static int minus (int x , int y) {
		return x - y;
	}
	
	
}
