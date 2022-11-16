package test.ch06;

public class This {
	//필드 
	String model;
	int speed;
	
	// this 생략불가 변수명이랑 필드명이 같음
	// 매개변수의 이름과 필드의 이름이 같으면 필드에 this를 붙임
	This(String model) {
		this.model = model; 
	}						
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		// 같은 클래스 안에 선언된 메서드에 this를 붙여줄수 있음
		// 생략도 가능함
		// 결국 지역변수와 전역변수가 햇갈리니까 this를 사용해서 구분
		this.setSpeed(100);
		System.out.println(this.model + "," + this.speed);
	}
}
