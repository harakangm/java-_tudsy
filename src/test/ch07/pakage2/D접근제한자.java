package test.ch07.pakage2;

import test.ch07.pakage1.A접근제한자;

public class D접근제한자 extends A접근제한자 {
	// protected는 상속을 통해서만 사용할 수 있다.
	public D접근제한자() {
		super(); // A클래스의 생성자 호출
	}
	
	public void method1() {
		// 상위 클래스의 필드를 값을 초기화시켜줌
		super.field = "test";
		// 상위 클래스의 메서드를 호출함
		super.method();
		
		//상속을 받았을때 this로 접근 가능
		this.field = "1";
		this.method();
	}
	
	public void method2 () {
		//protected 사용시 직접 객체를 생성해서 사용할수는 없다 상속으로만
		A접근제한자 a = new A접근제한자();
		
		a.field = "1"; // 별문제 없이 접근가능
		a.method(); // o
	}
}
