package test.ch07.다형성;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		//Car 클래스 필드에 객체를 생성해줄수 있게 생성자 실행
		//필드 값안에 객체값을 넣어줌
		myCar.tire = new 다형성kumhotire(); 
		
		다형성kumhotire tire2 = (다형성kumhotire)myCar.tire;
		
		myCar.run();
		
	}

}
