package test.ch06.exam01.pakage1;

// 클래스는 public , default 접근 제한자를 가질 수 있다.
// 생산자에는 public, default, private 접근제한자를 사용가능
// 아무것도 안 쓴 상태를 default 이다.
// public 패키지를 뛰어넘어서 사용가능 / default 패키지를 뛰어넘어서 사용불가

public class A2 {
	//1. 접근 제한자를 먹일수 있는곳
	// 클래스, 필드 , 생성자, 메소드
	
	A2 a3 = new A2("문자열");
	  
	public A2(boolean b) {
		
	}
	 
	A2(int b) {
		
	}
	 
	// 같은 클래스 안에서만 호출 가능
	private A2(String b) {
		
	}
	

	
}
