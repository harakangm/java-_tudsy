package test.ch08.인터페이스의다형성필드;

public class Car {
	//필드
	Tire tire1 = new HankukTire();
	Tire tire2 = new HankukTire();
	
	//메소드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
