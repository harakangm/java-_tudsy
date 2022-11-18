package test.ch07.매개변수형다형성;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
				// 자동타입변환 메서드의 매개변수 Venhicle venhicle = new Bus();
				// 자동형변환이 일어나서 자식객체의 오버라이드메서드를 실행시켜줌
		driver.drive(taxi);
	}

}
