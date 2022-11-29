package test.ch11.어노테이션;


public class Service {
	//필드

	String test;
	
	//생성자

	Service() {
		
	}
	//메서드
	//내가 적용함 메서드(타입,대상) 위에  @어노테이션을 적음
	@PrintAnnotation
	public void method1() {
		System.out.println("method1");
	}
	
	@PrintAnnotation(value="a")
	public void method2() {
		
		System.out.println("method2");
	}
	
	//값을 어노테이션에 넘겨 줄 수 있다
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("method3");
		
	}
}
