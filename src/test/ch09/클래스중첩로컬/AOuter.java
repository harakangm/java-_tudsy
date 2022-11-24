package test.ch09.클래스중첩로컬;

public class AOuter {
	//AOuter클래스의 인스턴스 필드와 메소드
	int field1;
	void method1() {
		
	}
	//A클래스의 정적 필드와 메소드
	static int filed2;
	static void method2() {
		
	}
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			field1 = 10; //인스턴스 멤버클래스에서는 아무문제없이 접근
			method1();
			
			AOuter.filed2  =10; //정적 멤버도 접근가능
			AOuter.method2();
		}
	}
	
	//정적 멤버 클래스
	static class C {
		void method() {
//			//정적 멤버 클래스에서는 바깥 클래스의 인스턴스 필드와 메소드에 접근 할 수가 없다.
//			field1 = 10; //x
//			method1();
			
			AOuter.filed2  =10; //o
			AOuter.method2();
		}
	}
	
}
