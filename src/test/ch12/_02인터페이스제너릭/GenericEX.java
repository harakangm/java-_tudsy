package test.ch12._02인터페이스제너릭;

public class GenericEX {

	public static void main(String[] args) {
		HomeAgency homeAc = new HomeAgency();
		
		Home home = homeAc.rent();
		
		
		home.turnOnLight();
		
		CarAgency carAc = new CarAgency();
		
		Car car = carAc.rent();
		
		car.run();
	}

}
 