package test.ch08.인테페이스의다형성02;

public class CastEx {

	public static void main(String[] args) {
//		Vehicle vehicle = new Bus();// 자동타입변환
//		
//		vehicle.run();
		
//		//강제타입변환
//		Bus bus = (Bus)vehicle;
//		bus.run();
//		bus.checkFare();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//아래의 조건문에서 Taxi 타입을 참조 하지 않아서 함수를 불러오지 못함
		ride(taxi);
		//강제 형변환후 자식객체의 checkFare()의 함수를 가지고옴
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		// 해당 객체를 참조 하고 있나판단 vehicle이 Bus 객체를 가지고 있냐?
		// Vehicle vehicle = new Bus()
		if (vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
	}
}
