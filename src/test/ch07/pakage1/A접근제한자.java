package test.ch07.pakage1;

public class A접근제한자 {
	
	//protected -> 같은 패키지 안에서 or 상속관계일때 접근 가능
	//클래스에는 적용이 안됨 (필드, 생성자 ,메소드)
	
	//필드
	protected String field;

	//생성자
	protected A접근제한자() {
		
	}
	
	//메소드
	protected void method () {
		
	}
}
