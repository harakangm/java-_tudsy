package test.ch06;

public class Car {
	//car라는 클래스를 생성
	//1. 필드 생성: 객체의 데이터를 저장
	String company = "현대자동차";
	String model; //속성들
	String color;
	int maxSpeed;
	int speed;
	boolean star; //시동여부
	
	/*
	 * 2.생성자 선언 : 생성 객체 생성시 초기화 역활 클래스 이름과 같은 이름으로 선언 
	 * 매개 변수는 자유롭게 줄 수있음 자바에서는 생성자를
	 * 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다
	 */
	// 생성자 overloading 생성자를 여러개 적을 수 있음
	// 순서나 타입이나 계수 중 하나는 달라야함

	Car(String model) {
//		this.model = model;
		//중복되는 코드제거 한 생성자에 있는 모든 것을 호출
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {
		/*
		 * this.model = model; this.color = color;
		 */
		this(model, color, 250);
	}
	
	
	Car(String model1, String color1, int maxSpeed1) {
		//this 현재의 객체를 가르킴
		this.model = model1;
		this.color = color1;
		this.maxSpeed = maxSpeed1;
	}
	
	

	
	
	
	
}
