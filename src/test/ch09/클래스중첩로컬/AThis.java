package test.ch09.클래스중첩로컬;

public class AThis {
	//AThis 클래스의 인스턴스 필드
	String filed = "A-field";
	
	//AThis 클래스의 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
	//인스턴스 멤버 클래스
	class B {
		//B의 인스턴스 필드
		String filed = "B-field";
		//B의 인스턴스 메소드	
		void method() {
			System.out.println("B-method");
		}
		//B 인스턴스 메서드
		void print() {
			//B개겣의 필드와 메서드 사용this 지금 현재 안에있는 클래스
			System.out.println(this.filed);
			this.method();
			
			//A객체의 필드와 메소드를 사용
			//바깥에 있는 변수명이 같을때 이런식으로 호출
			System.out.println(AThis.this.filed);
			AThis.this.method();
			
		}
	}
	
	//A클래스의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}
