package test.ch09.클래스중첩;

public class AStatic {
	// 정적 클래스
	// 접근제한자 public , private, default가 올 수있다
	static class B {
		//필드
		int filed1 = 1;
		
		//생성자
		B() {
			System.out.println("b생성자 실행");
		}
		
		void method1() {
			System.out.println("b 메서드 실행");			
		}
		
	}
	
	//1. 인스턴스 필드로 사용
	B field = new B();
	
	//정적 필드 값으로 사용
	static B field2 = new B();
	
	//2. 생성자에서 사용
	AStatic() {
		B b = new B();
	}
	
	//3. 인스턴스 메서드에서 사용가능
	void method1() {
		B b = new B();
	}
	
	// 정적 메소드에서 사용가능
	static void method2() {
		B b = new B();		
	}
	
}
