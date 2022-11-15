package test.ch06;

public class Calculator {
	//리턴값이 없는 메소드 선언 void로 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");		
	}
	
	//리턴값이 없는 메소드 선언 void로 선언
	void powerOff() {
		System.out.println("전원을 끕니다.");		
	}
	
	//int형으로 리턴값이 있는 메소드
	//매개변수의 개수와 타입에 맞춰서
	int plus(int x, int y) {
		int result = x + y ;
		return result;
	}
	
	//double형으로 리턴값이 있는 메소드
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
//===============================================================	
	// 메소드 오버로딩: 같은 이름의 메소드 여러개를 만든다.
	// 메소드 오버로딩에서는 매개변수의 순서 개수 타입 중 하나가 달라야함
	// 메소드 오버로딩은 
	double areaRectangle (double width) {// 정사각형
		return width * width;
	}

//	//매개변수의 수와 개수 타입이 같아서 컴파일 에러가 뜸
//	double areaRectangle (double h) {
//		return width * width;
//	}
	
	double areaRectangle (double width, double height) {//직사각형
		return width * height;
	}
	
	
	
}
