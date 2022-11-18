package test.ch07.추상클래스;

public class Cat extends Animal{

	// 반드시 오버라이드
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}
