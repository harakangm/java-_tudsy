package test.ch07.다형성;

public class Car {
	//필드로 타이어 객체를 만듬
	//필드로 다형성을 구현
	//필드만 선언하고 객체로 만들어지지않음.
	public 다형성Tire tire;
	
	public void run () {
	 tire.roll();
		//타이어를 굴리는 메소드.
	
	}
	
}
