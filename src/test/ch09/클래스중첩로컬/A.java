package test.ch09.클래스중첩로컬;

public class A {
	// 로컬클래스 메소드안에 클래스를 생성
	void useB(int arg) { //final int age
		
		// 로컬변수생성
		int var = 1; // 자바 8버전 아래 fianl int var
		
		class B {
			// B클래스의 인스턴스필드 생성
			int field1 = 1;

			// 생성자

			B() {
				System.out.println("B생성자 실행");
			}

			// 인스턴스 메서드
			void method1() {
				System.out.println("B메소드 실행");
			}

			// 로컬변수

			void method2() {
				//중첩했을때 클래스안에서 매개변수의 값을 바꿀 수 없음
				//지역변수와매개변수둘다
//				arg = 2;
//				var = 4;
			}

		}
		// 메소드 안에서 객체 생성
		B b = new B(); // 생성자 실행
		System.out.println(b.field1);
		b.method1();
	}

}