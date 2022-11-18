package test.ch07.추상클래스;

public class Dog extends Animal{
	// 추상메소드를 반드시 오버라이드 해야함
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
