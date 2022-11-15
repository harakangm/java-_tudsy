package test.ch06;

public class Car2Ex {
	
	//인스턴스 필드
	int speed;
	
	//인스턴스 메소드
	
	void run () {
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	void run2 () {
		this.run();
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	// 스태틱 메소드로(정적메소드) 만듬
	static void simulate () {
//		this.speed = 200;
//		this.run(); x 인스턴스 메소드 실행 불가
		
		// 객체 생성 자기 자신 클래스 안에서도 생성가능
		// 스태틱 메소드에서 인스턴스 필드에 접근할려면 객체를 생성 후 접근해야함
		Car2Ex myCar = new Car2Ex ();
		
		myCar.speed = 200; 
		myCar.run(); 
	}
	

	public static void main(String[] args) {
		// 클래스 안에다 메인메소드를 바로 넣을 수 있다
		// 실행을 시키면 메인메소드부터 실행
		simulate();// 메인메소드가 클래스 안에 있어서 클래스명을 안붙여도됨
		
		Car2Ex myCar = new Car2Ex ();
		
		myCar.speed = 60; 
		myCar.run(); 
	
		
	}

}
