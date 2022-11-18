package test.ch07;

public class 형변환ChildEx {
	public static void main(String[] args) {
//		//자식 객체 자동타입변환
//		형변환Child child = new 형변환Child();
//		
//		형변환Parent parent = child; // 자동타입 변환
//		
//		parent.method1();
//		// 자식에게 오버라이드 되어있는 method2를 불러옴
//		parent.method2();
//		//// 객체간 자동 형변환이 일어났을때 자식객체에 있는 메서드는 불러오지 못한다.
////		parent.method3();
//		
//		parent.a = 2;
//	//// 자동형변환에서는 자식객체에 있는 필드에 접근 불가
////		parent.b = 1;
		
		형변환Parent parent = new 형변환Child(); // 자동타입 변환
		// instanceof: 객체타입 확인을 위한 자바에서 제공하는 연산자. 
		// 자식객체에 부모가객첵가 들어와있는지 확인
		// 패런츠가 형변환Child 타입이냐?
		// parent가 형변환Child 타입이 아니라면 강제타입 변환 할 수 없으므로
		
		if (parent instanceof 형변환Child) { // parent매개변수가 형변환Child객체를 담고 있냐?
			// 자동타입변환후에 강제타입변환을 함
			형변환Child child = (형변환Child)parent; // 강제타입 변환
			//자동타입변환을 했을때 자식객체에 있는 필드와 메서드가 필요할때 사용
			//자식객체에 접근 가능
			child.b = 1;
			child.method3();			
		}
		
		
		
		
		
	}
}
