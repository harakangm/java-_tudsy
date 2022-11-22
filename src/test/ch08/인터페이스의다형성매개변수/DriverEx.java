package test.ch08.인터페이스의다형성매개변수;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi =new Taxi();
		
		driver.driver(new Bus()); //버스가 달립니다.
		driver.driver(taxi);	  //택시가 달립니다.
		
		//instenceOf
	
	}

}
